package com.biz.grade.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.biz.grade.config.SplitPos;
import com.biz.grade.vo.ScoreVO;
import com.biz.grade.vo.StudentVO;

public class ScoreServiceImplV1 implements ScoreService {

	// 필드변수
	protected Scanner scan;
	protected List<ScoreVO> scoreList;
	String scoreFile = "";
	protected PrintWriter printWriter;

	public ScoreServiceImplV1() {
		scan = new Scanner(System.in);
		scoreList = new ArrayList<>();
		scoreFile="src/com/biz/grade/exec/data/score.txt";
		this.loadScore();
	}

	@Override
	public boolean inputScore() { // 성적정보 입력

		System.out.println("학번을 입력해 주세요 >>");
		String stNum = scan.nextLine();

		int intNum = 0;
		try {
			intNum = Integer.valueOf(stNum);

		} catch (Exception e) {
			System.out.println("학번은 숫자만 입력이 가능합니다");

		}

		if (intNum > 99999) {
			System.out.printf("%05d", intNum);
		}

		System.out.println("국어점수를 입력해 주세요 >>");
		String intKor = scan.nextLine();

		int kor = 0;
		try {
			kor = Integer.valueOf(intKor);
		} catch (Exception e2) {
			// TODO: handle exception
		}

		System.out.println("영어점수를 입력해 주세요 >>");
		String intEng = scan.nextLine();

		int eng = 0;
		try {
			eng = Integer.valueOf(intEng);

		} catch (Exception e3) {

		}

		System.out.println("수학점수를 입력해 주세요 >>");
		String intMath = scan.nextLine();

		int math = 0;
		try {
			math = Integer.valueOf(intMath);

		} catch (Exception e4) {

		}

		System.out.println("음악점수를 입력해 주세요 >>");
		String intMusic = scan.nextLine();

		int music = 0;
		try {
			music = Integer.valueOf(intMusic);

		} catch (Exception e5) {

		}
		ScoreVO svo = new ScoreVO();
		svo.setStNum(stNum);
		svo.setIntKor(kor);
		svo.setIntEng(eng);
		svo.setIntMath(math);
		svo.setIntMusic(music);

		scoreList.add(svo);
		return true;
	}

	@Override
	public void calcSum() {
		// TODO Auto-generated method stub

		int size = scoreList.size();
		for (ScoreVO svo : scoreList) {

			int sum = svo.getIntKor();
			sum += svo.getIntEng();
			sum += svo.getIntMath();
			sum += svo.getIntMusic();

			svo.setIntSum(sum);
			scoreList.add(svo);
		}
	}

	@Override
	public void calcAvg() {
		// TODO Auto-generated method stub
		int size = scoreList.size();
		for (ScoreVO svo : scoreList) {
			float avg = svo.getIntSum() / 4;

			svo.setIntAvg(avg);
			scoreList.add(svo);

		}
	}

	public void loadScore() {
		// TODO Auto-generated method stub
		scoreList.clear();

		FileReader fileReader = null;
		BufferedReader buffer = null;

		try {
			fileReader = new FileReader(scoreFile);
			buffer = new BufferedReader(fileReader);

			String reader = "";
			while (true) {
				reader = buffer.readLine();
				if (reader == null) {
					break;
				}

				String[] scores = reader.split(",");
				ScoreVO svo = new ScoreVO();

				svo.setStNum(scores[SplitPos.SCORE.SC_NUM]);
				svo.setIntKor(Integer.valueOf(scores[SplitPos.SCORE.SC_KOR]));
				svo.setIntMath(Integer.valueOf(scores[SplitPos.SCORE.SC_MATH]));
				svo.setIntEng(Integer.valueOf(scores[SplitPos.SCORE.SC_ENG]));
				svo.setIntMusic(Integer.valueOf(scores[SplitPos.SCORE.SC_MUSIC]));
				svo.setIntSum(Integer.valueOf(scores[SplitPos.SCORE.SC_SUM]));
				svo.setIntAvg(Integer.valueOf(scores[SplitPos.SCORE.SC_AVG]));

				scoreList.add(svo);
			}
			buffer.close();
			fileReader.close();

		} catch (Exception e) {
			System.out.println("내용없음");
		}
	}

	@Override
	public void saveScore() {
		// TODO Auto-generated method stub
		PrintStream outPut = null;

		try {
			outPut = new PrintStream(scoreFile);

			for (ScoreVO svo : scoreList) {

				// 거래일자, 입금, 출금, 잔액
				outPut.printf("%s,%d,%d,%d,%d,%d,%d\n", svo.getStNum(), 
						svo.getIntKor(),
						svo.getIntEng(),
						svo.getIntMath(),
						svo.getIntMusic(),
						svo.getIntSum(),
						svo.getIntAvg());
			}

			outPut.close(); // 닫아야 저장됨!!!!!!!!!

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public boolean outputScore() {
		// TODO Auto-generated method stub
		this.inputScore();
		this.saveScore();
		return true;
	}

	public void scoreList() { // 여기서 성적 리스트 출력
		// TODO Auto-generated method stub
		System.out.println("==============================================");
		System.out.println("성적 일람표");
		System.out.println("==============================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t음악\t총점\t평균");
		System.out.println("----------------------------------------------");

		int size = scoreList.size();
		for (int i=0; i<size; i++) {
			ScoreVO svo = new ScoreVO();
			System.out.print(svo.getStNum());
			System.out.print(svo.getIntKor());
			System.out.print(svo.getIntEng());
			System.out.print(svo.getIntMath());
			System.out.print(svo.getIntMusic());
			System.out.print(svo.getIntSum());
			System.out.print(svo.getIntAvg());
		}
	}

}
