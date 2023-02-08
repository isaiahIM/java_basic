package q2;

public class Q2 {
	public static void main(String[] args) {
		final int N=3;// 줄의 높이
		int starCnt, spaceCnt;// 별 갯수, 공백 갯수
		int i, j, k;
		
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
	}
}
