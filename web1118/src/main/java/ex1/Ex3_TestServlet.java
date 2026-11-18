package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet(urlPatterns = {"/Ex3_TestServlet"},
initParams = {
		@WebInitParam(name = "message", value="안녕하세요"), 
				@WebInitParam(name= "version", value= "11.18V01")
})
public class Ex3_TestServlet extends HttpServlet {
	private String message;
	private String version;

	private String company;

	public Ex3_TestServlet() {

	}

	@Override
	public void init() throws ServletException {
		company = getServletContext().getInitParameter("company");
		System.out.println("init:" + company);
		message = getServletConfig().getInitParameter("messeage");
		version = getServletConfig().getInitParameter("version");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");

		PrintWriter out = resp.getWriter();

		out.println("회사명: " + company);
		out.println("<ul>");
		out.println("<li>멤버 필드 message: " + message + "</li>");
		out.println("<li>멤버 필드 version: " + version + "</li>");
		out.println("</ul>");
	}
}
