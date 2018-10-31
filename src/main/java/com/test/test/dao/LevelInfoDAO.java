package com.test.test.dao;

import java.util.List;

import com.test.test.vo.LevelInfo;


public interface LevelInfoDAO {

	public List<LevelInfo> getLevelInfoList(LevelInfo li);
	public int insertLevelInfo(LevelInfo li);
	public int deleteLevelInfo(int linum);
	public LevelInfo getLevelInfoList(Integer linum);
	public int updateLevelInfo(LevelInfo li);
	public int getLinum();
}
