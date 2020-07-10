package com.biz.grade.service;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.vo.StudentVO;

public class StudentServiceImplV1 implements StudentService {
	protected List<StudentVO> studentList;
	protected PrintStream outPut;
	protected Scanner scan;

	public StudentServiceImplV1() {
		studentList = new ArrayList<>();
		outPut=new PrintStream(System.out);
		scan = new Scanner(System.in);
		
	}
	

	@Override
	public boolean inputStudent() { // 학생 정보 입력!!
		//학번, 이름, 학과, 학년, 전화번호를 키보드 통해 입력받기!
		// 여긴 학번만...
	
		StudentVO std = new StudentVO();
		// 이름 학과 학년 전화번호 입력받는 곳!
		
		System.out.println("학번을 입력해 주세요 >>");
		String strNum=scan.nextLine();
		
		int stNum=0;
		try {
			stNum =Integer.valueOf(stNum);
		} catch (Exception e) {
			System.out.println("학번은 숫자만 입력이 가능합니다");
			return true;
		}
		std.setStNum(strNum);
		

		System.out.println("이름을 입력해 주세요 >>");
		String name = scan.nextLine();
		std.setName(name);

		System.out.println("학과를 입력해 주세요 >>");
		String dept = scan.nextLine();
		std.setDept(dept);

		System.out.println("학년를 입력해 주세요 >>");
		String grade = scan.nextLine();

		int intgrade = 0;
		try {
			intgrade = Integer.valueOf(grade);

		} catch (Exception e) {

			System.out.println("학년은 숫자만 입력 가능!");
			return true;

		}
		std.setGrade(intgrade);

		System.out.println("전화번호를 입력해 주세요 >>");
		String strtel = scan.nextLine();
		int tel=0;
		try {
			tel=Integer.valueOf(strtel);
		} catch (Exception e) {
			// TODO: handle exception
		}
		std.setTel(strtel);
		
		studentList.add(std);
		
		// 학번 이름 학과 학년 전화보드 입력받기!

		return true;
	}
	




	@Override
	public void studentList() {
		// TODO Auto-generated method stub
		String[] stdTitle = {"학번","이름","학과","학년","전화번호"};
		
		System.out.println("학생정보");
		
		for(StudentVO std : studentList) {
			System.out.print(std.getStNum()+"\t");
			System.out.print(std.getName()+"\t");
			System.out.print(std.getDept()+"\t");
			System.out.print(std.getGrade()+"\t");
			System.out.println(std.getTel());
		}
		System.out.println("출력완료");
		scan.nextLine();
		
	}
}