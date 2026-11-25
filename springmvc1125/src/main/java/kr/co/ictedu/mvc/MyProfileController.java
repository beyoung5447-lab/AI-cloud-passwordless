package kr.co.ictedu.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyProfileController {
	@GetMapping("/profile")
	public ModelAndView sayHello() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "홍길동");
		mav.addObject("msg1", "300");
		mav.setViewName("profile");
		return mav;
	}
}
