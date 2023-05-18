package q4;

import java.util.*;

public class Q4 {
	public static void main(String[] args) {
		int scores[] = new int[1000];
		int subjectCnt;
		int maxScore=-1;
		float sum=0, mean=0;
		int i;
		
		Scanner input = new Scanner(System.in);
		
		subjectCnt=input.nextInt();// 과목 갯수 입력
		
		for(i=0; i<subjectCnt; i++) {// 과목 점수 입력
			scores[i]=input.nextInt();
		}
		
		for(i=0; i<subjectCnt; i++) {// 가장 높은 점수 찾기
			if(maxScore<scores[i]) {
				maxScore=scores[i];
			}
		}
		
		for(i=0; i<subjectCnt; i++) {// 점수 수정
			sum+=((float)scores[i]/maxScore)*100;
		}
		
		mean=sum/subjectCnt;
		
		
		System.out.print(mean);
	}
}
