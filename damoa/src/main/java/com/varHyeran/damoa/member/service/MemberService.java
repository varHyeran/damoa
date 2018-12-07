package com.varHyeran.damoa.member.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.varHyeran.damoa.member.mapper.MemberMapper;
import com.varHyeran.damoa.member.vo.MemberVo;

@Service
@Transactional	// 메소드 처리 도중 에러가 났을 때 자동으로 롤백
public class MemberService {
	@Autowired	// 의존관계를 자동설정할 때 사용
	private MemberMapper memberMapper;
	
	public List<MemberVo> getMember() {
		System.out.println("MemberService.getMember() 호출");
		List<MemberVo> memberList = memberMapper.selectMemberAll();
		return memberList;
	}
}
