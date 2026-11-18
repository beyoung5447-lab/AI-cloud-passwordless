package ex4;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/Ex1_Lamda")
public class Ex1_Lamda extends HttpServlet {
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
Runnable oldway = new Runnable() {
	
	@Override
	public void run() {
		System.out.println("익명 내부 클래스 실행");
		
	}
};
oldway.run();
Runnable lambda = () -> System.out.println("람다식 실행");
lambda.run();
}
}
