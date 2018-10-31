package com.test.test.dao.impl;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.test.dao.UserInfoDAO;
import com.test.test.vo.Userinfo;

@Repository
public class UserInfoDAOImpl implements UserInfoDAO {

	@Autowired
	private SqlSessionTemplate SqlSessionTemplate;
	
	@Override
	public List<Userinfo> getUserinfoList(Userinfo userinfo) {
		return SqlSessionTemplate.selectList("SQL.USERINFO.selectUserInfoList", userinfo);
	
	}
	@Override
	public Userinfo getUserinfo(int uiNum) {
		return SqlSessionTemplate.selectOne("SQL.USERINFO.selectUserInfo", uiNum);
	}

	@Override
	public int insertUserinfo(Userinfo userinfo) {
		return SqlSessionTemplate.insert("SQL.USERINFO.insertUserInfo", userinfo);
	}

	@Override
	public int deleteUserinfo(int userinfoNumber) {
		return SqlSessionTemplate.delete("SQL.USERINFO.deleteUserInfo", userinfoNumber);
	}

	@Override
	public int updateUserinfo(Userinfo userinfo) {
		return SqlSessionTemplate.update("SQL.USERINFO.updateUserInfo", userinfo);
	}

	
}
