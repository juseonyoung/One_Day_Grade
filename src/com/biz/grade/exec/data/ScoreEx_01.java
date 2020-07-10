package com.biz.grade.exec.data;

import java.util.Scanner;

import com.biz.grade.service.ScoreService;
import com.biz.grade.service.ScoreServiceImplV1;
import com.biz.grade.service.StudentService;
import com.biz.grade.service.StudentServiceImplV1;

public class ScoreEx_01 {

	public static void main(String[] args) {
		// 여기서 실행하는 곳!!
		Scanner scan = new Scanner(System.in);
		ScoreService sService = new ScoreServiceImplV1();
		StudentService stdService = new StudentServiceImplV1();

		while(true) {
			System.out.println("=============================================");
			System.out.println("성적 정보 열람 시스템");
			System.out.println("=============================================");
			System.out.println("1 >>> 학생정보 입력");
			System.out.println("2 >>> 성적정보 입력");
			System.out.println("3 >>> 학생의 성적리스트 출력");
			System.out.println("-1 >>> 서비스 종료");
			System.out.println("---------------------------------------------");
			System.out.println("원하시는 서비스를 선택하세요 >>");

			String strMenu = scan.nextLine();
			int intMenu = 0;
			try {
				intMenu = Integer.valueOf(strMenu);
			} catch (Exception e) {
				System.out.println("메뉴선택은 숫자로만 가능합니다");
				System.out.println("처음으로 돌아갑니다");
				continue;
			}

			if (intMenu == -1) {
				System.out.println("서비스를 종료 합니다");
				break;
			} else if (intMenu < 1 || intMenu > 3) {
				System.out.println("서비스를 실행할 수 없습니다!");
				continue;
			}

		
			if(intMenu ==1) {
				System.out.println("학생정보 입력 서비스를 실행합니다");
				stdService.inputStudent();
			} else if (intMenu==2) {
				System.out.println("성적 입력서비스를 실행합니다");
				sService.inputScore();
			} else if (intMenu==3) {
				System.out.println("성적 리스트를 출력합니다");
				sService.scoreList();
			}

		}
	}
}
