package com.varHyeran.damoa.member.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.varHyeran.damoa.member.service.MemberService;
import com.varHyeran.damoa.member.vo.MemberVo;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;
	@RequestMapping(value="/member/listMember", method=RequestMethod.GET)
	public String listMember(Model model){
		System.out.println("MemberController.listMember() 호출");
        List<MemberVo> memberList = memberService.getMember();
        model.addAttribute("memberList", memberList);
		return "member/listMember";         
	}
}
