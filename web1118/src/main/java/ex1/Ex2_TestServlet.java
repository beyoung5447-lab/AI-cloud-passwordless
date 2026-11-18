package ex1;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Ex2_TestServlet")
public class Ex2_TestServlet extends HttpServlet {
    private String message ;   
    private String version ;   
    //context-param:  Servletcontext 객체: 모든  Servlet에 다 적용되는 scope  
    private String company ;     
public Ex2_TestServlet( ) {
	message = "테스형 하이";
	version = "11.18";
	//company = getServletConfig().getInitParameter("company");
	//System.out.println("init:"+company);
}@Override
public void init() throws ServletException {
	company = getServletContext().getInitParameter("company");
		System.out.println("init:"+company);
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