package com.youtube.model;

import java.util.Date;

public class Video {

	private String title;
	private String comment;
	private Date uploadAt;
	private int count; // views
	private String imUrl;
	private String fileUrl;
	
	public Video() {
	}

	public Video(String title, String comment, Date uploadAt, int count, String imUrl, String fileUrl) {
		this.title = title;
		this.comment = comment;
		this.uploadAt = uploadAt;
		this.count = count;
		this.imUrl = imUrl;
		this.fileUrl = fileUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getUploadAt() {
		return uploadAt;
	}

	public void setUploadAt(Date uploadAt) {
		this.uploadAt = uploadAt;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String getImUrl() {
		return imUrl;
	}

	public void setImUrl(String imUrl) {
		this.imUrl = imUrl;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	@Override
	public String toString() {
		return "Video [title=" + title + ", comment=" + comment + ", uploadAt=" + uploadAt + ", count=" + count
				+ ", imUrl=" + imUrl + ", fileUrl=" + fileUrl + "]";
	}
	
	/*
	 * Create : 추가
	 * Read : 읽기 (1개, 목록)
	 * Update : 수정
	 * Delete : 삭제
	 * 
	 * */
	
	
	
}
