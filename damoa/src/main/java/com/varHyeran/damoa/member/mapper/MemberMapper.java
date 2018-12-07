package com.varHyeran.damoa.member.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.varHyeran.damoa.member.vo.MemberVo;

@Mapper
public interface MemberMapper {
	// 1. select all
	List<MemberVo> selectMemberAll();	// public, abstract
}
