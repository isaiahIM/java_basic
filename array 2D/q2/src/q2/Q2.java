package q2;

import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		
		int arr[][]=new int[100][100];// 도화지 배열
		int paperCnt;// 색종이 갯수
		int x, y;// 색종이 좌표
		int i, j, k;
		int area=0;// 색종이 영역 넓이
		Scanner sc=new Scanner(System.in);
		
		paperCnt=sc.nextInt();// 색종이 갯수 입력
		
		for(i=0; i<paperCnt; i++) {// 색종이 갯수만큼 반복
        	/*색종이 좌표 입력*/
			x=sc.nextInt();
			y=sc.nextInt();
			
            /*색종이 부착*/
			for(j=x; j<x+10; j++) {
				for(k=y; k<y+10; k++) {
					arr[j][k]=1;
				}
			}
			
		}
		
        /*색종이 면적 계산*/
		for(i=0; i<arr.length; i++) {
			for(j=0; j<arr[i].length; j++) {
				area+=arr[i][j];
			}
		}
		
		System.out.println(area);
	}
}