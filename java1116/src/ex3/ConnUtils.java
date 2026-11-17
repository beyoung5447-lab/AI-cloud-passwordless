package ex3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnUtils {
    static {
        try {
            // 해당 경로의 클래스가 있으면 클래스로 로딩
            Class.forName("oracle.jdbc.driver.OracleDriver");
            System.out.println("드라이버 로딩완료");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    // protocol@//host:port:sid
    // jdbc:oracle:thin:@//localhost:1521/FREEPDB1
    public static Connection getConn() throws SQLException {
        String url = "jdbc:oracle:thin:@//localhost:1521/FREEPDB1";
        String user = "mypass";
        String pwd = "mypass";
        return DriverManager.getConnection(url, user, pwd);
    }

    public static void main(String[] args) {
        try (Connection con = getConn();) {
            System.out.println("접속 테스트 Test :"+ con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}