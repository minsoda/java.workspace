package com.youtube.controller;

import java.util.ArrayList;
import java.util.List;

import com.youtube.model.Comment;

// 개인 과제 예시
public class CommentController {

	List<Comment> comments = new ArrayList<>();
	UserController uc = new UserController();

	// C : 댓글 작성 --> 로그인된 회원만 가능!

	public void addComment(String id, String password, Comment comment) {
		if(uc.login(id, password)) {
			comments.add(comment);
		}
	}


	// R : 댓글 1개 보기
	public Comment veiwComment(int index) {
		return comments.get(0);

	}

	// U : 댓글 수정 --> 로그인한 회원과 이 댓글을 작성한 작성자가 일치
	public void updateComment(int index, Comment comment) {
		comments.set(0, comment);
	}

	// D : 댓글 삭제 --> 로그인한 회원과 이 댓글을 작성한 작성자가 일치
	public void DeleteCommnet(int index) {
		comments.remove(0);
	}


}
