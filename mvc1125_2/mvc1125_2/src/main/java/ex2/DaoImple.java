package ex2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// AOP & JDBC에서 Statement, prepareStatement 차이를 함께 학습
// <bean id="dao" class=/>
@Component("dao")
public class DaoImple implements DaoInter {
	@Autowired
	private MYconn myConn;

	public DaoImple() {
		System.out.println("DaoImple 생성자 호출");
	}

	// Statement VS PreparedStatement 속도 차이 체크
	// Statement 상위 객체이기 때문에 직접 사용하는 회사는 드물고
	// 면접시 주로 물어볼 수 있다.
	// 오라클이 SQL문을 실행할 때 -> 문법검사 -> 패치 -> 실행 -> 버퍼저장 : 값이 다르면 모두 다 검사(전수조사)
	// PreparedStatement : 한번만 검사를 한 후 나머지는 ? 바인딩 처리 -> 하나검사(표본 조사
	// AOP :
	@Override
	public String firstStatementTest(int code) {
//		long start = System.currentTimeMillis();
		if (code == 1) {
			try (Connection con = myConn.getConnection(); Statement stmt = con.createStatement()) {
				for (int i = 1; i <= 10000; i++) {
					StringBuilder sql = new StringBuilder();
					sql.append("insert into speedtest values(");
					sql.append(i).append(",'");
					sql.append("xman" + i).append("',");
					sql.append("sysdate)");
					System.out.println("Log1 => " + sql);
					stmt.executeUpdate(sql.toString());
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else if (code == 2) {
			StringBuilder sql = new StringBuilder();
			sql.append("insert into speedtest values(?,?,sysdate)");
			try (Connection con = myConn.getConnection();
					PreparedStatement pstmt = con.prepareStatement(sql.toString())) {
				for (int i = 1; i <= 10000; i++) {
					pstmt.setInt(1, i);
					pstmt.setString(2, "xman" + i);
					pstmt.executeUpdate();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
//		long end = System.currentTimeMillis();
//		System.out.println("소요시간 :" + (end - start));
		return "Check 완료 *****";
	}

	@Override
	public String firstTest() {
//		long start = System.currentTimeMillis();
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.print(i + " ");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
//		long end = System.currentTimeMillis();
//		System.out.println("소요시간" + (end - start));
		return "Check 완료*****";
	}

}