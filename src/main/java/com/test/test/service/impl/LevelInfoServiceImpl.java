package com.test.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.test.dao.LevelInfoDAO;
import com.test.test.service.LevelInfoService;
import com.test.test.vo.LevelInfo;


@Service
public class LevelInfoServiceImpl implements LevelInfoService {

	@Autowired
	private LevelInfoDAO lidao;
	@Override
	public List<LevelInfo> getLevelInfoList(LevelInfo li) {
		return lidao.getLevelInfoList(li);
	}
	@Override
	public int insertLevelInfo(LevelInfo li) {
		return lidao.insertLevelInfo(li);
	}
	@Override
	public int deleteLevelInfo(int linum) {
		return lidao.deleteLevelInfo(linum);
	}
	@Override
	public LevelInfo getLevelInfo(Integer linum) {
		return lidao.getLevelInfoList(linum);
	}
	@Override
	public int updateLevelInfo(LevelInfo li) {
		return lidao.updateLevelInfo(li);
	}
	@Override
	public int getLinum() {
		return lidao.getLinum();
	}

}
