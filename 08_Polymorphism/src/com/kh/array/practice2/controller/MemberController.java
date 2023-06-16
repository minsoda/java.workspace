package com.kh.array.practice2.controller;

import com.kh.array.practice2.model.Member;

public class MemberController {
	
	
	private Member[] mArr = new Member[3];
	public int count = 0;
//	mArr[count++] = new Member(id, name, password, email, gender, age);

//	public void insertMember(String id, String name, String password, String email, int gender, int age) {
	
	public void insertMember(Member m) {
	 //객체 배열에 객체 하나씩 추가한다고 생각
	// count를 인덱스라고 생각
	// score[0] = 100;
	// stuArr[0] = new Student();

		
//	mArr[count++] = new Member(m.getId(), m.getName(), m.getPassword(), m.getEmail(), m.getGender(), m.getAge());
	mArr[count++] = m;
}

public boolean updateMember(String id, String name, String password, String email) {
	// checkId 활용! <--- index
	//추가처럼 수정도 같은 방식, 해당 인덱스 값에 넣는 방식
	//setter 이용
	int index = this.checkId(id);
	if(index !=-1) {
		mArr[index].setName(name);
		mArr[index].setPassword(password);;
		mArr[index].setEmail(email);
		return true;
	}
	return false;
}

public int checkId(String id) { //id 검색
	//객체 배열 값들 for문을 돌려서 일치하면 확인해서 return값
	
	for(int i =0; i<mArr.length; i++) {
		
		if(mArr[i]!= null && mArr[i].getId().equals(id)) {
			return i;
			
		}
	}
		return -1;	//0으로 시작하니까 일치하지 않을때 -1로 넘김.
	
}

public Member[] printAll() {
	return mArr;
}


}