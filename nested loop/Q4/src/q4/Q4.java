package q4;

public class Q4 {
	public static void main(String[] args) {
		final int N=3;// up pyramid 기준 높이
		int i, j, k;
		int starCnt, spaceCnt;
		
		/*down pyramid*/
		starCnt=(2*N)-1;
		spaceCnt=0;
		for(i=0; i<N; i++) {// down pyramid 높이
			for(j=0; j<spaceCnt; j++)// 공백 출력
				System.out.print(" ");
			
			for(k=0; k<starCnt; k++)// 별 출력
				System.out.print("*");
			
			System.out.println();
			starCnt-=2;// 별 갯수 2개 김소
			spaceCnt++;// 공백 갯수 1개 증가
		}
		
		/*up pyramid*/
		starCnt=3;// 별 갯수는 3개부터
		spaceCnt=N-2;// 공백 갯수는 N-2부터
		for(i=0; i<N-1; i++) {// up pyramid 높이
			for(j=0; j<spaceCnt; j++)// 공백 출력
				System.out.print(" ");
			
			for(k=0; k<starCnt; k++)// 별 출력
				System.out.print("*");
			
			System.out.println();
			starCnt+=2;// 별 갯수 2개 증가
			spaceCnt--;// 공백 갯수 1개 감소
		}
	}
}
