package com.varHyeran.damoa.member.vo;

public class MemberVo {
	private int memberNo;
	private String memberName;
	private String memberAge;
	private String memberAddr;
	private String memberPhone;
	
	public int getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
		System.out.println(memberNo + "<-- MemberVo.setMemberNo");
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
		System.out.println(memberName + "<-- MemberVo.setMemberName");
	}
	public String getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(String memberAge) {
		this.memberAge = memberAge;
		System.out.println(memberAge + "<-- MemberVo.setMemberAge");
	}
	public String getMemberAddr() {
		return memberAddr;
	}
	public void setMemberAddr(String memberAddr) {
		this.memberAddr = memberAddr;
		System.out.println(memberAddr + "<-- MemberVo.setMemberAddr");
	}
	public String getMemberPhone() {
		return memberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
		System.out.println(memberPhone + "<-- MemberVo.setMemberPhone");
	}
	@Override
	public String toString() {
		return "memberVo [memberNo=" + memberNo + ", memberName=" + memberName + ", memberAge=" + memberAge
				+ ", memberAddr=" + memberAddr + ", memberPhone=" + memberPhone + "]";
	}
}
