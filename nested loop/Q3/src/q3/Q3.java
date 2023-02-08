package q3;

public class Q3 {
	public static void main(String[] args) {
		final int N=3;// up pyramid 높이
		int starCnt, spaceCnt;// 별 갯수, 공백 갯수
		int i, j, k;
		
		/*up pyramid*/
		starCnt=1;// 별 갯수는 1개부터
		spaceCnt=N-1;// 공백 갯수는 N-1부터
		for(i=0; i<N; i++) {
			for(j=0; j<spaceCnt; j++)// 공백 출력
				System.out.print(" ");
			
			for(k=0; k<starCnt; k++)// 별 출력
				System.out.print("*");
			
			System.out.println();
			starCnt+=2;// 별 갯수 2개 증가
			spaceCnt--;// 공백 갯수 1개 감소
		}
		
		/*down pyramid*/
		starCnt=2*(N-1)-1;
		spaceCnt=1;
		for(i=0; i<N-1; i++) {
			for(j=0; j<spaceCnt; j++)// 공백 출력
				System.out.print(" ");
			
			for(k=0; k<starCnt; k++)// 별 출력
				System.out.print("*");
			
			System.out.println();
			starCnt-=2;// 별 갯수 2개 감소
			spaceCnt++;// 공백 갯수 1개 증가
		}
	}
}
