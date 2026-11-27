package kr.co.ictedu.mvc.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import kr.co.ictedu.mvc.dto.upBoardDTO;

@Controller
public class UploadDemoController {
	@GetMapping("/upform")
	public String upform() {
		return "updemo/upform";
	}

	// <form action="uploadpro" method="post"
	@PostMapping("/uploadpro")
	public String uploadFile(Model m, upBoardDTO vo, HttpServletRequest request) {
		// 파라미터 테스트
		System.out.println("Title :" + vo.getTitle());
		System.out.println("content :" + vo.getContent());
		// MultipartFile 객체에서 이름 확인 - 파일업로드 처리
		MultipartFile mf = vo.getMfile();
		String oriFn = mf.getOriginalFilename();// 파일의 이름
		System.out.println("oriFn:" + oriFn + ",length" + oriFn.length());
		if (oriFn.length() > 0) {
			String img_path = "resource\\imgfile";
			String r_path = request.getSession().getServletContext().getRealPath("/");
			System.out.println("r_path:" + r_path);
			StringBuffer path = new StringBuffer();
			path.append(r_path).append(img_path).append("\\");
			path.append(oriFn);
			System.out.println("FullPath:" + path);
			File f = new File(path.toString());
			if (!f.exists()) {
				f.mkdir();

			}
			try {
				mf.transferTo(f);
			} catch (IllegalStateException | IOException e) {
				e.printStackTrace();
			}
			vo.setImgn(oriFn);
			long size = mf.getSize();
			String contentType = mf.getContentType();
			System.out.println("파일크기:" + size);
			System.out.println("파일의 type" + contentType);
		}

		return "redirect:upList";
	}

	@RequestMapping("/upList")
	public String upBoardList(Model model) {
		return "updemo/uplist";
	}
}
