package model;

import java.io.IOException;

import controller.ActionForward;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
// 결합도를 낮추기 위해서 
// Model들이 구현하는 인터페이스
// 사용 : ActionFactory 가 생성해서 
// ControllServlet에게 반환 해주고
// ControllServlet execute를 호출하면서 
// 해당 모델이 ActionFactory에 의해서 생성이 되고 호출이 된다.
// 반환값인 ActionFoward 받아서 url을보고 어떤 view를 보여줄지 결정
// forward라면 모델에서 넘어온 값을 request.setAttribute로 저장해서
// 해당 view를 forwarding시킨다.
public interface Action {
	ActionForward execute(HttpServletRequest request,
			HttpServletResponse response) 
					throws ServletException,IOException;
}
