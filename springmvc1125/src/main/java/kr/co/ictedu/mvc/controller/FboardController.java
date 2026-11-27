package kr.co.ictedu.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import kr.co.ictedu.mvc.dao.FBoardDaoInter;
import kr.co.ictedu.mvc.dto.FBoardDTO;

@Controller
public class FboardController {
	@Autowired
	private FBoardDaoInter fBoardDaoInter;

	@GetMapping("/fboardForm")
	public String fboardForm() {
		return "/fboard/write";
	}

	// vo.setSubject(request.getParameter("subject"))
	@PostMapping("/fboardInsert")
	public String fboardInsert(FBoardDTO vo) {
		System.out.println("subject: " + vo.getSubject());
		System.out.println("�ۼ���: " + vo.getWriter());
		fBoardDaoInter.addFBoard(vo);
		return "redirect:fboardList";
	}

	@GetMapping("/fboardList")
	public String fboardList(Model m) {
		List<FBoardDTO> flist = fBoardDaoInter.listFBoard();
		m.addAttribute("flist", flist);
		return "/fboard/list";
	}

	@GetMapping("/fboardHit")
	public String fboardHit(int num) {
		fBoardDaoInter.updateHit(num);
		return "redirect:fboardDetail?num=" + num;
	}

	@GetMapping("/fboardDetail")
	public String fboardDetail(int num, Model m) {
		FBoardDTO v = fBoardDaoInter.detailFBoard(num);
		m.addAttribute("v", v);
		return "/fboard/info";
	}

	@GetMapping("/fboardUpForm")
	public String fboardUpForm(int num, Model m) {
		FBoardDTO v = fBoardDaoInter.detailFBoard(num);
		m.addAttribute("v", v);
		return "/fboard/update";
	}

	@PostMapping("/fboardUpdate")
	public String fboardUpdate(FBoardDTO v) {
		// Spring�� ������ ���� �� ��ȣ, ����, �ۼ���, ������ v�� ��� �ش�.
		fBoardDaoInter.updateFBoard(v);
		// DAO�� v�� ������ �ش� �Խñ��� �����Ѵ�.
		return "redirect:fboardDetail?num=" + v.getNum();
		// ������ �Խñ��� �� �������� �̵��Ѵ�.
		// ���� ��� 3�� ���� �����ߴٸ� fboardDetail?num=3���� �̵��Ѵ�.
	}

	@GetMapping("/fboardDelete") // GET /fboardDelete?num=3�� ���� ��û�� ������ ����ȴ�.
	public String fboardDelete(int num) {
		fBoardDaoInter.deleteFBoard(num);
		// �ּ��� ?num=3���� ���� �� ��ȣ�� DAO�� ������ �ش� ���� �����Ѵ�.
		return "redirect:fboardList"; // redirect:�� ��ȯ�ϸ� �������� ������ �ּҷ� �� ��û�� ������ �ȴ�
		// ���� fboardList�� �̵��Ѵ�.
	}
}
