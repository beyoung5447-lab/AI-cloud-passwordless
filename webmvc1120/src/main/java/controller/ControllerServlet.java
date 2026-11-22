package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Action;

import java.io.IOException;
import java.io.PrintWriter;

//url => main.ict?cmd=? 
//http://localhost/webmvc1120/main.ict?cmd=hello
//main.ict, all.ict 즉 모든 요청을 *.ict 로 오면 현재 서블릿이 모두 응답함 
@WebServlet("*.ict")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// cmd -> ActionFactory
		// A)붕어빵 주문 : cmd == bpang일때 Factory 는=> Action action = new Bungeoppang();
		// B)cmd == hello => Action action = new HelloAction();
		// A) action.execute(req,resp); //붕어빵이 재정의 한 자식 메서드가 실행
		// B) action.execute(req,resp);
		request.setCharacterEncoding("utf-8");
		// 주문을 받자.
		String cmd = request.getParameter("cmd");
		if (cmd != null) {
			// 1. ActionFactory생성한다. (싱글톤 생성)
			// 공장장한테 주문 받은것을 전달 하기 위해서 공장장을 처음 한번은 생성하고 그다음부터는 부른다.
			ActionFactory factory = ActionFactory.getInstance();
			// 2. cmd를 Factory의 getAction의 매개변수로 전달하고 Action을 반환
			// 공장장에게 실제 일을 시킨다.
			// 만약 요청이 cmd = bpang => Action action = new Bungeoppang(); 만들어서 Action반환
			// 해준다.*****
			Action action = factory.getAction(cmd);
			// 3. interface Action을 잘 사용한다.
			// 만약 붕어빵이라면 ActionFoward에는 url="bpang"뷰의 이름 , 이동방식은 false Forward
			ActionForward af = action.execute(request, response);
			System.out.println("viewName:" + af.getUrl());
			// 이동 방식
			if (af.isMethods()) { // redirect
				response.sendRedirect(af.getUrl());
			} else { // forward
				// af.getUrl() => 붕어빵:bpang ,헬로:hello
				String viewName = "/WEB-INF/views/" + af.getUrl() + ".jsp";
				request.getRequestDispatcher(viewName).forward(request, response);
			}
		} else {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.println("<h2 style=\"color:red\">올바른 요청이 아닙니다");
			out.println("</h2>");
		}

	}
}
