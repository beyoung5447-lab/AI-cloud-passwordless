package ex1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@WebServlet("/ex1_Hello")
public class EX1_HelloServlet extends HttpServlet {
	private ApplicationContext ctx;

	@Override
	public void init() throws ServletException {
		ctx = new GenericXmlApplicationContext("ex1/ex1.xml");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Ex1_Hello ref = ctx.getBean("ex1", Ex1_Hello.class);
		String msg = ref.printHello();
		req.setAttribute("msg", msg);
		req.getRequestDispatcher("ex1_hello.jsp").forward(req, resp);
	}
}
