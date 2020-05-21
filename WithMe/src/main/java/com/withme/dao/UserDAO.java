package com.withme.dao;

import com.withme.vo.UserVO;

public interface UserDAO {
	
	//회원가입
	public void register(UserVO userVO) throws Exception;

	//로그인
	public UserVO login(UserVO userVO) throws Exception;
}
