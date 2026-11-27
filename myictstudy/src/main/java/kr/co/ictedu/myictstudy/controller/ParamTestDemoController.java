package kr.co.ictedu.myictstudy.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ictedu.myictstudy.vo.MemoVO;

@RestController
//모든 요청에서 demo라고 왔을 때 현재 컨트럴러가 응답
@RequestMapping("/demo")
public class ParamTestDemoController {
	private final MemoController memoController;
	ParamTestDemoController(MemoController memoController) {
		this.memoController = memoController;
	}

	// POST방식으로 데이터를 받아보기 1
	// 기존의 FormData형식
	@PostMapping("/add")
	public ModelAndView addMemo(MemoVO vo) {
		System.out.println(vo.getMtitle());
		System.out.println(vo.getMcontent());
		System.out.println(vo.getMwriter());
		ModelAndView mav = new ModelAndView();
		mav.addObject("vo", vo);
		// 입력 처리후 ModelAndView 객체를 사용해서 리다이렉트로 이동하는 방법 , 스프링 MVC와 동일하다.
		mav.setViewName("redirect:list");
		return mav;
	}

	// POST방식으로 데이터를 받아보기 2
	// @RequestBody => post방식으로 데이터가 json형식으로 전송되어 올때 DTO에 저장하기 위한
	// 방법 *****
	/*
	 * react에서 데이터를 전송하는 형태 { "num": 2, "mtitle":"점심시간 이에요", "mwriter": "테스형",
	 * "ncontent": "오늘은 금요일!!!!!!", "reip": "192.168.0.11", "mdate": "2025-12-01" }
	 */
	// http://192.168.0.53:9001/myictstudy/demo/addJson => post
	@PostMapping("/addJson")
	public ModelAndView addMemoJson(@RequestBody MemoVO vo) {
		System.out.println("AddJSon");
		System.out.println("Num :" + vo.getNum());
		System.out.println("Writer:" + vo.getMwriter());
		System.out.println("Conts :" + vo.getMcontent());
		System.out.println("Reip :" + vo.getReip());
		System.out.println("Date :" + vo.getMdate());
		ModelAndView mav = new ModelAndView();
		mav.addObject("vo", vo);
		// 입력 처리후 ModelAndView 객체를 사용해서 리다이렉트로 이동하는 방법 , 스프링 MVC와 동일하다.
		mav.setViewName("redirect:list");
		return mav;
	}

	@RequestMapping("/list")
	public List<MemoVO> memoList() {
		// 가상 데터를 저장하기 위해서 생성
		List<MemoVO> list = new ArrayList<>();
		// 가상 데이터를 List에 저장
		for (int i = 0; i < 3; i++) {
			MemoVO vo = new MemoVO();
			vo.setNum(i + 1);
			vo.setMtitle("테스트" + i);
			vo.setMwriter("테스형" + i);
			vo.setMcontent("반가워요" + i);
			vo.setReip("192.168.0.11");
			vo.setMdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
			list.add(vo);
		}
		return list;
	}

	@GetMapping("/uname")
	public String getMemo(@RequestParam(value = "user", defaultValue = "테스형") String writer) {
		System.out.println("writer:" + writer);
		return "작성자" + writer;
	}

	@GetMapping("/mybooks/{num2}")
	public String getMemo(@PathVariable("num2") int num) {
		System.out.println("PathVariable num:" + num);
		return "Memo 번호" + num;
	}

	@PostMapping("/mybooks/{writer}/{conts}")
	public String postMemo(@PathVariable("writer") String writer, @PathVariable("conts") String conts) {
		System.out.println("작성자:" + writer);
		System.out.println("내용:" + conts);
		return "작성 완료";

	}

	@GetMapping({ "/yourbooks/{num}", "/yourbooks/{num}/{writer}" })
	public String getMemo(@PathVariable(value = "num") int num,
			@PathVariable(value = "writer", required = false) String writer) {
		if (writer == null) {
			writer = " 테스형";

		}
		System.out.println("번호" + num + ",작성자:" + writer);
		return "번호:" + num + ",작성자:" + writer;
	}

	@GetMapping({ "/yourbooks2/{num}", "/yourbooks2/{num}/{writer}" })
	public String getMemo2(@PathVariable(value = "num") int num,
			@PathVariable(value = "writer", required = false) String writer) {
		return "번호:" + num + ",작성자:" + writer;

	}

	@GetMapping("/agent")
	public String userAgent(@RequestHeader("User-Agent") String userAgent) {
		System.out.println("userAgent" + userAgent);
		String browser = "알수 없음";
		if (userAgent.contains("Edg/")) {
			browser = "마이크로소프트 엣지 브라우저";

		} else if (userAgent.contains("Chrome/")) {
			browser = "chrome  브라우저";
		} else if (userAgent.contains("Firefox/")) {
			browser = "Firefox 브라우저";
		} else {
			browser = "설치 되지 않은 브라우저";
		}
		return "브라우저 Aget 정보" + browser;
	}
	
@GetMapping("auth")
public String auth(@RequestHeader("Authorization")String autHeaders) {
	System.out.println("font에서 전송된 토큰값:"+autHeaders);
    return "인증된 토큰값:"+autHeaders;
}

}

