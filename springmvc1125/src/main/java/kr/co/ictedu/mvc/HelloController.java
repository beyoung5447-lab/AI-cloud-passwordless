package kr.co.ictedu.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ictedu.mvc.dao.FBoardDaoInter;
import kr.co.ictedu.mvc.dto.FBoardDTO;

//Controller인 DispatcherServlet 의 요청에 따라 HandlerMapping 처리되는 것
@Controller // DispatcherServlet 에서 들어오는 요청을 분석해주기 위한 특수한 빈
public class HelloController {
	@Autowired
	private FBoardDaoInter fBoardDaoInter;

	@GetMapping("/hello")
	public ModelAndView sayHello() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "안녕하세요 나의 첫 Spring MVC 입니다.");
		mav.setViewName("hello");
		return mav;
	}

	@GetMapping("/addTest")
	public ModelAndView addTest() {
		FBoardDTO dto = new FBoardDTO();
		dto.setWriter("테스형");
		dto.setPwd("11");
		dto.setSubject("test");
		dto.setContent("test2");
		dto.setReip("192.168.0.1");
		fBoardDaoInter.addFBoard(dto);

		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "잘 넣었음");
		mav.setViewName("hello");
		return mav;
	}
}