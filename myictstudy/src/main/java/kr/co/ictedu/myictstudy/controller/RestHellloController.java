package kr.co.ictedu.myictstudy.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class RestHellloController {
	
	@GetMapping("/hello")
	public String getHello() {
		return "안녕하세요 나의 첫 스프링 부트 입니다";
	}

}
