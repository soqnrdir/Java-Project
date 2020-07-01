package lecture20.member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class InfoDAO {
	List<InfoModel> selectList() {
		ResultSet resultSet = null;
		Connection connection = null;
		Statement statement = null;
		List<InfoModel> list = null; // list에 담아줄 객체 생성
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 파일 불러오기
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.20.2:1521:xe", "java", "oracle");
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT INFO_NO, PC_NO, NM, EMAIL, HOBBY FROM INFO");
			list = new ArrayList<InfoModel>();
			while (resultSet.next()) { // 한줄씩 읽어오기
				int infoNo = resultSet.getInt("INFO_NO");
				String pcNo = resultSet.getString("PC_NO");
				String nm = resultSet.getString("NM");
				String email = resultSet.getString("EMAIL");
				String hobby = resultSet.getString("HOBBY");
				list.add(new InfoModel(infoNo, pcNo, nm, email, hobby));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (resultSet != null) {
				resultSet.close();
			}
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	InfoModel select(int infoNo) {
		return null;
	}

	void insert(InfoModel model) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 파일 불러오기
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.20.2:1521:xe", "java", "oracle");
			statement = connection.createStatement();
			model.getPcNo();
			String sql = "INSERT INTO INFO(INFO_NO, PC_NO, NM, EMAIL, HOBBY) VALUES(INFO_SEQ.NEXTVAL, '"+ model.getPcNo() + " ', '" 
						 + model.getNm() + "', '" + model.getEmail() + "', '" + model.getHobby() + "')";
			int update = statement.executeUpdate(sql); //실행 성공한 숫자를 리턴해줌.
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	void update(InfoModel model) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 파일 불러오기
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.20.2:1521:xe", "java", "oracle");
			statement = connection.createStatement();
	
			String sql = "UPDATE INFO SET HOBBY = '"+model.getHobby()+"' WHERE INFO_NO = " + model.getInfoNo();
			int update = statement.executeUpdate(sql); //실행 성공한 숫자를 리턴해줌.
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

	void delete(int infoNo) {
		Connection connection = null;
		Statement statement = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 드라이버 파일 불러오기
			connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.20.2:1521:xe", "java", "oracle");
			statement = connection.createStatement();
	
			String sql = "DELETE FROM INFO WHERE INFO_NO = " + infoNo;
			int update = statement.executeUpdate(sql); //실행 성공한 숫자를 리턴해줌.
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			if (connection != null) {
				connection.close();
			}
			if (statement != null) {
				statement.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
