package com.youtube.model;

public class User {

	public String email;
	public String phone;
	public String id;
	public String password;
	public String nickName;
	public char gender;
	
	// 로그인
	public boolean login() {
		return false;
	}
	
	// 회원가입 
	public boolean signUp() {
		return false;
	}
	
	// 프로필 보기, 바뀐데이터 때문에 User
	public User viewProfile() {
		return null;
	}
	
	// 프로필 수정, 바뀐데이터 때문에 User
	public User updateProfile() { 
		return null;
	}
	
	// 계정 삭제
	public boolean deleteProfile() {
		return false;
	}
}
