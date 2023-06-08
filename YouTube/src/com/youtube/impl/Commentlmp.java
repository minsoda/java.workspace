package com.youtube.impl;

import com.youtube.model.Comment;

public interface Commentlmp {

	// 팀과제는 이 방식!
	public void addComment(String id, String password, Comment comment);

	public Comment veiwComment(int index);

	public void updateComment(int index, Comment comment);

	public void DeleteCommnet(int index);

}
