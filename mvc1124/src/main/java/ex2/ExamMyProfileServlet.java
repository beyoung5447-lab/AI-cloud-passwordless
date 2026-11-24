package ex2;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import ex2.ExamMyProfile;

@WebServlet("/ExamMyProfile")
public class ExamMyProfileServlet extends HttpServlet {
	private ApplicationContext ctx;

	@Override
	public void init() throws ServletException {
		ctx = new GenericXmlApplicationContext("ex2/ex2_profile.xml");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ExamMyProfile ref = ctx.getBean("ex2_profile", ExamMyProfile.class);
		String profile = ref.print();
		req.setAttribute("profile", profile);
		req.getRequestDispatcher("exam_profile.jsp").forward(req, resp);
	}
}
