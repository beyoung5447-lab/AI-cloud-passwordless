package kr.co.ictedu.myictstudy.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.co.ictedu.myictstudy.service.MemoService;
import kr.co.ictedu.myictstudy.vo.MemoVO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


//postman 경로
// http://192.168.0.53:9001/myictstudy/memo/add => post
//RestFulAPI 적용
@RestController
//대분류
//@@RequestMapping => All Mapping
@RequestMapping("/memo")
public class MemoController {
	@Autowired
	private MemoService memoService;
	@PostMapping("/add")
	public ModelAndView addMemo(MemoVO vo) {
		System.out.println("제목 :" + vo.getMtitle());
		System.out.println("내용 :" + vo.getMcontent());
		System.out.println("작성자 :" + vo.getMwriter());
		ModelAndView mav = new ModelAndView();
		memoService.add(vo);
		mav.addObject("vo", vo);
		return mav;
	}

	@RequestMapping("/list")
	public List<MemoVO> memoList() {
		List<MemoVO> list = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			MemoVO vo = new MemoVO();
			vo.setNum(i + 1);
			vo.setMwriter("테스형" + i);
			vo.setMcontent("반가워요" + i);
			vo.setReip("192.168.0.53");
			vo.setMdate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
			list.add(vo);
		}
		return list;
	}
	@GetMapping("/detail")
	public MemoVO memoDetail(@RequestParam("num") int num) {
	System.out.println("detail=>"+num);
	int i=num;
	MemoVO vo = new MemoVO();
	vo.setNum(i);
	vo.setMtitle("테스형"+i);
	vo.setMwriter("반강워요"+i);
	vo.setMcontent("반가워요"+i);
	vo.setReip("192.168.0.11");
	vo.setMdate(new SimpleDateFormat("yyyy-mm-dd").format(new Date()));
	return vo;
	}
	@DeleteMapping("/delete")
	public ModelAndView memoDelete(@RequestParam("num")int num) {
		System.out.println("삭제 처리:"+num);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:list");
		return mav;
	}
	
	
}
