package com.test.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.test.dao.UserInfoDAO;
import com.test.test.service.UserInfoService;
import com.test.test.vo.Userinfo;

@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	UserInfoDAO uidao;
	@Override
	public List<Userinfo> getUserinfoList(Userinfo userinfo) {
		return uidao.getUserinfoList(userinfo);
	}

	@Override
	public int insertUserinfo(Userinfo userinfo) {
		return uidao.insertUserinfo(userinfo);
	}

	@Override
	public int deleteUserinfo(int userinfoNumber) {
		return uidao.deleteUserinfo(userinfoNumber);
	}

	@Override
	public int updateUserinfo(Userinfo userinfo) {
		return uidao.updateUserinfo(userinfo);
	}

	@Override
	public Userinfo getUserinfo(int uiNum) {
		// TODO Auto-generated method stub
		return null;
	}

}
