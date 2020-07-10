package com.biz.grade.service;

public interface ScoreService {

	//필요한 메서드 원형 정의
	// 학번,국영수 점수, 총점 ,평균
	
	public boolean inputScore(); // 성적정보 입력
	
	public void calcSum(); //총점계산
	public void calcAvg(); //평균계산
	
	public void loadScore(); //불러오고
	public void saveScore(); // 스코어 저장
	public boolean outputScore(); //스코어 출력
	public void scoreList(); //정보 리스트
	
}
