package model;

import java.io.IOException;

import controller.ActionForward;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Bungeoppang implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("bpang", "맛있는 붕어빵!");
		return new ActionForward("bpang", false);
	}

}
