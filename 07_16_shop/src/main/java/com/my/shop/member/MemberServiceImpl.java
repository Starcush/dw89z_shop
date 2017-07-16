package com.my.shop.member;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Component;

@Component("MemberService")
public class MemberServiceImpl implements MemberService {

	@Resource(name = "sqlSession")
	private SqlSession sqlSession;

	private MemberDaoMapper memberDao;

	public MemberServiceImpl() {
		super();
		System.out.println("MemberServiceImpl() called");
	}

	@Override
	public void insertMember(Member m) {
		// TODO Auto-generated method stub
		memberDao = sqlSession.getMapper(MemberDaoMapper.class);
		memberDao.insertMember(m);
	}

	@Override
	public Member getMemberById(String id) {
		memberDao = sqlSession.getMapper(MemberDaoMapper.class);
		System.out.println("MemberServiceImpl      " + memberDao.selectById(id));
		return memberDao.selectById(id);
	}

}
