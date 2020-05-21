package com.withme.service;

import java.util.List;

import com.withme.vo.PartyVO;
import com.withme.vo.PartylistVO;
import com.withme.vo.SearchCriteria;

public interface PartyService {

	// 게시글 작성
	public void write(PartyVO partyVO) throws Exception;
	
	// 게시글 조회
	public List<PartylistVO> list(SearchCriteria scri) throws Exception;
	
	// 게시글 총 갯수
	public int listCount(SearchCriteria scri) throws Exception;
	
	// 게시물 목록 조회
	public PartyVO read(int party_id) throws Exception;
	
	// 해쉬태그 개수
	public int hashCount(String keyword) throws Exception;
	
}
