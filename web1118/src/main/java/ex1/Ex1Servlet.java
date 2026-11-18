package ex1;

import java.io.IOException;
import java.util.Enumeration;
import jakarta.servlet.annotation.WebServlet;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Ex1Servlet")
public class Ex1Servlet extends HttpServlet {
	public Ex1Servlet() {
		System.out.println("생성자 호출!");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("초기화 메서드 호출!");
	}
	

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("서비스 매서드 호출!");
		System.out.println("요청 방식:" + req.getMethod());
	}
	private void destory() {
		System.out.println("서비스 destory Servlet매서드 호출! test");
		

	}
}
