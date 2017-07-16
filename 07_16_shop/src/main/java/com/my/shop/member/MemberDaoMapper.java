package com.my.shop.member;

public interface MemberDaoMapper {
	void insertMember(Member m);
	Member selectById(String id);
}
