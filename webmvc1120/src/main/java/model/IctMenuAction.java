package model;

import java.io.IOException;

import controller.ActionForward;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class IctMenuAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String cmd = request.getParameter("cmd");

		if ("pizza".equals(cmd)) {
			request.setAttribute("title", "피자");
			request.setAttribute("desc", "치즈가 듬뿍 올라간 바삭한 피자!");
			request.setAttribute("imgPath", "images/menu2.png");
			return new ActionForward("IctMenuAction", false);
		} else if ("goguma".equals(cmd)) {
			request.setAttribute("title", "군고구마");
			request.setAttribute("desc", "달콤하고 포근하게 구운 군고구마!");
			request.setAttribute("imgPath", "images/menu3.png");
			return new ActionForward("menuDetail", false);
		}
		return new ActionForward("bpangForm");
	}

}
