package lecture18.network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerExample {
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket();
			serverSocket.bind(new InetSocketAddress("localhost", 5001)); // 127.0.0.1
			while (true) {
				System.out.println("[연결 기다림]");
				Socket socket = serverSocket.accept();
				InetSocketAddress address = (InetSocketAddress) socket.getRemoteSocketAddress();
				String hostName = address.getHostName();
				System.out.println("[연결 수락함]: " + address.getHostName());
				//데이터 받기
				InputStream inputStream = socket.getInputStream();
				byte[] b = new byte[1024];
				int readCount = inputStream.read(b);
				String message = new String(b, 0, readCount, "UTF-8"); //0부터 readCount 까지만 저장
				System.out.println("[" + hostName + "]" +message);
				//데이터 보내기 
				OutputStream outputStream = socket.getOutputStream();
				outputStream.write(message.getBytes());
				outputStream.flush(); // 버퍼 비우기
				
				inputStream.close();
				outputStream.close();
				socket.close();
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		if (!serverSocket.isClosed()) {
			try {
				serverSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
