package q1;

import java.util.*;

public class Q1 {
	public static void main(String[] args) {
		int N, M;
		int sum;
		int i, j, l;
		int K;
		int startX, startY, endX, endY;
		
        Scanner sc=new Scanner(System.in);
        
        /*배열 크기 입력*/
        N=sc.nextInt();
        M=sc.nextInt();
        
        int arr[][]=new int[N][M];
        
        /*배열 값 입력*/
		for(i=0; i<N; i++) {
			for(j=0; j<M; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		
		K=sc.nextInt();// 합 구하는 갯수 입력
        
		for(i=0; i<K; i++) {
			sum=0;
            /*시작, 종료위치 입력*/
			startY=sc.nextInt()-1;
			startX=sc.nextInt()-1;
			endY=sc.nextInt();
			endX=sc.nextInt();
			
            /*합 구하기*/
			for(j=startY; j<endY; j++) {
				for(l=startX; l<endX; l++) {
					
					sum+=arr[j][l];
				}
			}
			System.out.println(sum);
		}
		
	}
}
