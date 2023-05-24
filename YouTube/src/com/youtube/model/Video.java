package com.youtube.model;

import java.util.Date;

public class Video {

	public String title;
	public String comment;
	public Date uploadAt;
	public int count; // views
	public String imUrl;
	public String fileUrl;
	
	/*
	 * Create : 추가
	 * Read : 읽기 (1개, 목록)
	 * Update : 수정
	 * Delete : 삭제
	 * 
	 * */
	
	//영상 업로드 
	public Video upload() {
		return null;
		
	}
	
	// 영상 목록
	public Video[] viewList() {
		return null;
	}
	
	
	//영상 1개 보기
	public Video viewVideo() {
		return null;
	}
	
	//동영상 수정
	public Video updateVideo() {
		return null;
	}
	
	//동영상 삭제
	public boolean deleteViedeo() {
		return false;
	}
	
}
