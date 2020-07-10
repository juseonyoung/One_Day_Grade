package com.biz.grade.vo;

public class ScoreVO {

	// 학생 스코어 domain
	private String stNum; //학번 StudentVO 와 겹치는 유일한 변수
	private int intKor;
	private int intEng;
	private int intMath;
	private int intMusic;
	private int intSum;
	private float intAvg;
	public String getStNum() {
		return stNum;
	}
	public void setStNum(String stNum) {
		this.stNum = stNum;
	}
	public int getIntKor() {
		return intKor;
	}
	public void setIntKor(int intKor) {
		this.intKor = intKor;
	}
	public int getIntEng() {
		return intEng;
	}
	public void setIntEng(int intEng) {
		this.intEng = intEng;
	}
	public int getIntMath() {
		return intMath;
	}
	public void setIntMath(int intMath) {
		this.intMath = intMath;
	}
	public int getIntMusic() {
		return intMusic;
	}
	public void setIntMusic(int intMusic) {
		this.intMusic = intMusic;
	}
	public int getIntSum() {
		return intSum;
	}
	public void setIntSum(int intSum) {
		this.intSum = intSum;
	}
	public float getIntAvg() {
		return intAvg;
	}
	public void setIntAvg(float intAvg) {
		this.intAvg = intAvg;
	}
	
	
	
	
	
}
