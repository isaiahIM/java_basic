package q5;

public class Q5 {
	public static void main(String[] args) {
		final int N=4;
		int starCnt, spaceCnt;
		int i, j;
		
		/*상하대칭 윗부분*/
		starCnt=2;
		spaceCnt=(2*N)-3;
		for(i=0; i<N-1; i++) {
			
			for(j=0; j<(starCnt/2); j++)// 별 출력
				System.out.print("*");
			
			for(j=0; j<spaceCnt; j++)// 공백 출력
				System.out.print(" ");
			
			for(j=0; j<(starCnt/2); j++)// 별 출력
				System.out.print("*");
			
			System.out.println();
			
			spaceCnt-=2;// 공백 갯수 2 감소
			starCnt+=2;// 별 갯수 2 증가
		}
		
		starCnt=(2*N)-1;// 대칭점 별 갯수
		for(j=0; j<starCnt; j++)// 별 출력
			System.out.print("*");
		System.out.println();
		
		/*상하대칭 아렛부분*/
		starCnt=2*(N-1);
		spaceCnt=1;
		for(i=0; i<N-1; i++) {
			
			for(j=0; j<(starCnt/2); j++)// 별 출력
				System.out.print("*");
			
			for(j=0; j<spaceCnt; j++)// 공백 출력
				System.out.print(" ");
			
			for(j=0; j<(starCnt/2); j++)// 별 출력
				System.out.print("*");
			
			System.out.println();
			
			spaceCnt+=2;// 공백 갯수 2 감소
			starCnt-=2;// 별 갯수 2 증가
		}
	}
}