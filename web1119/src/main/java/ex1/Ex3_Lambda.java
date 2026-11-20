package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Ex3_Lambda")
public class Ex3_Lambda extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Message hello = name -> "안녕" + name;
		Message formal = name -> {
			String result = "반갑습니다" + name;
			return result;
		};
		PrintWriter out = resp.getWriter();
		resp.setContentType("text/html;charset=utf-8");
		out.println("<p>" + hello.make("지혜") + "</p>");
		out.println("<hr");
		out.println("<p>" + formal.make("채은") + "</p>");
		out.println("<hr>");

	}
}
