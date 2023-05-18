package q2;

import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		int student[]= new int[30];
		int i;
		
		Scanner input = new Scanner(System.in);
		
		for(i=0; i<28; i++) {// 총 28명이 출석함
			student[input.nextInt()-1]++;// 빈도수 증가
		}
		
		for(i=0; i<30; i++) {// 총 30명 학생
			if(student[i]==0) {// 만약 출석하지 않았으면
				System.out.println(i+1);// 출석 안한 학생 번호 출력
			}
		}
		
	}
}
