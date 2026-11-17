package ex3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class BoardDao {

	private static BoardDao dao;

	private BoardDao() {

	}

	public static BoardDao getDao() {
		if (dao == null) {
			dao = new BoardDao();
		}
		return dao;
	}

	
	public void addBoard(BoardVO vo) {
		String sql = "insert into board (num,title,writer,cont,bdate) VALUES "
				+ "(board_seq.nextVal,?,?,?, sysdate)";
		
		try (Connection con = ConnUtils.getConn(); 
			 PreparedStatement pstmt = con.prepareStatement(sql);) {
			
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getWriters()); 
			pstmt.setString(3, vo.getCont());
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("제목:");
		String title = sc.nextLine();
		System.out.print("작성자:");
		String writer = sc.nextLine();
		System.out.print("내용:");
		String cont = sc.nextLine();
		
		BoardVO vo = new BoardVO();
		vo.setTitle(title);
		vo.setWriters(writer); 
		vo.setCont(cont);
		
		BoardDao dao = BoardDao.getDao();
		dao.addBoard(vo);
		System.out.println("값이 데이터베이스에 저장됨!");
		
		List<BoardVO> resList = dao.getList();
		for (BoardVO e : resList) {
			
			System.out.println(e.getNum() + " : " + e.getWriters());
			System.out.println("----------------");
		}
	}

	// SELECT * FROM board order by 1 desc
	// SELECT된 데이터를 자동화 처리
	public List<BoardVO> getList() {
		List<BoardVO> bList = new ArrayList<BoardVO>();
		String sql = "SELECT * FROM board order by 1 desc";
		
		try (Connection con = ConnUtils.getConn();
			 PreparedStatement pstmt = con.prepareStatement(sql);
			 ResultSet rs = pstmt.executeQuery();) { 
			
			while (rs.next()) {
				BoardVO v = new BoardVO();
				v.setNum(rs.getInt("num"));
				v.setTitle(rs.getString("title"));
				v.setWriters(rs.getString("writer"));
				v.setCont(rs.getString("cont")); 
				v.setBdate(rs.getString("bdate"));
				
				bList.add(v); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return bList; 
	}
}