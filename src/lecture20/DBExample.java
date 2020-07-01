package lecture20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBExample {
	public static void main(String[] args) {
		//OracleDriver
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //드라이버 파일 불러오기
			Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "java", "oracle");
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from employees");
			while (resultSet.next()) {
				String empName = resultSet.getString("emp_name");
				String email = resultSet.getString("email");
				System.out.println(empName + ":" +email);
			}
			resultSet.close();
			statement.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


