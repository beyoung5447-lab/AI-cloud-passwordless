package model;

import java.io.IOException;

import controller.ActionForward;
import controller.ActionForward;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Action 인터페이스 가맹점에 소속
public class HelloAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//requestScope로 값을 저장
		request.setAttribute("msg", "나의 첫 모델2 MVC패턴 입니다.");
		//뷰이름 : hello.jsp , 이동방식 : forward
		return new ActionForward("hello", false);
	}

}
