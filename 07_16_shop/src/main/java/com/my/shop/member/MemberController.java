package com.my.shop.member;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@Resource(name = "MemberService")
	private MemberService mService;

	@RequestMapping(value = "/member/insert.do")
	public String memberJoin() {
		return "redirect:/";
	}

	@RequestMapping(value = "/member/login.do")
	public String memberLogin(Member m, HttpServletRequest request) {
		Member member = mService.getMemberById(m.getId());
		if (member != null && member.getPwd().equals(m.getPwd())) {
			HttpSession session = request.getSession();
			session.setAttribute("member", member);
			return "redirect:/";
		}else{
			return "member/loginFail";
		}
		
	}
	
	@RequestMapping(value = "/member/logout.do")
	public String memberLogout(HttpServletRequest request){
		HttpSession session = request.getSession(false);
		session.invalidate();
		return "redirect:/";
	}
}
