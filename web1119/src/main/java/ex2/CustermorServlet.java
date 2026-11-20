package ex2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.jsp.tagext.TryCatchFinally;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

@WebServlet(name = "Custermor", urlPatterns = { "/Custermor" })
public class CustermorServlet extends HttpServlet {
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
		//Map<String, String[]> maps = request.getParameterMap();
		//for (Map.Entry<String, String[]> e : maps.entrySet()) {
		//	System.out.println("파라미터 이름: " + e.getKey());
			//for (String f : e.getValue()) {
			//	System.out.println("파라미터 값: " + f);
			//}
		
	//}
		  CustomerVO vo = new CustomerVO();
		 try {
			BeanUtils.populate(vo, request.getParameterMap());
			vo.setCadte(new SimpleDateFormat("yyyy-mm-dd").format(new Date()));
			request.setAttribute("customer", vo);
			request.getRequestDispatcher("ex1_EL.jsp").forward(request, response);;
			
		} catch (IllegalAccessException | InvocationTargetException e) {
			e.printStackTrace();
		}
}
}