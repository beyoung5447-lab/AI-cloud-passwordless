package ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ex1_Connection {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@//localhost:1521/FREEPDB1";
		String user = "mypass";
		String pwd = "mypass";
		try (Connection con = DriverManager.getConnection(url, user, pwd);) {
			System.out.println("oracle 연결:" + con);

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
