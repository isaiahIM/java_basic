package q3;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
    	
    	int i, j;
    	int num;
    	int cnt=0;// 게임 횟수
    	int colorCnt=0, bingoCnt=0;
    	int arr[][]= new int[5][5];
    	Scanner sc=new Scanner(System.in);
    	
        /*빙고판 입력*/
    	for(i=0; i<5; i++) {
    		for(j=0; j<5; j++) {
    			arr[i][j]=sc.nextInt();
    		}
    	}
    	
    	
    	while(bingoCnt<3) {
    		bingoCnt=0;// 빙고 초기화(안해주면 빙고가 누적됨)
    		num=sc.nextInt();// 숫자 받아오기
    		
    		numFinder:
            /*빙고판에서 숫차 찾기*/
    		for(i=0; i<5; i++) {
        		for(j=0; j<5; j++) {
        			if(arr[i][j]==num) {
        				arr[i][j]=0;
        				break numFinder;
        			}
        		}
    		}
    		
    		/*가로*/
        	for(i=0; i<5; i++) {
        		for(j=0; j<5; j++) {
        			if(arr[i][j]==0) {
        				colorCnt++;
        			}
        		}
        		if(colorCnt==5) {
        			bingoCnt++;
        		}
        		colorCnt=0;// 색칠된 부분 카운트 초기화
        	}
        	
        	
        	/*세로*/
        	for(i=0; i<5; i++) {
        		for(j=0; j<5; j++) {
        			if(arr[j][i]==0) {
        				colorCnt++;
        			}
        		}
        		if(colorCnt==5) {
        			bingoCnt++;
        		}
        		colorCnt=0;// 색칠된 부분 카운트 초기화
        	}
        	
        	/*왼쪽 위->오른족 아래*/
        	for(i=0; i<5; i++) {
        		if(arr[i][i]==0) {
        			colorCnt++;
        		}
        	}
        	if(colorCnt==5) {
        		bingoCnt++;
        	}
        	colorCnt=0;// 색칠된 부분 카운트 초기화
        	
        	
        	/*오른쪽 위->왼쪽 아래*/
        	j=4;
        	for(i=0; i<5; i++) {
        		if(arr[i][j]==0) {
        			colorCnt++;
        		}
        		j--;
        	}
        	if(colorCnt==5) {
        		bingoCnt++;
        	}
        	colorCnt=0;// 색칠된 부분 카운트 초기화
        	
        	cnt++;
    	}
    	
    	
    	
    	System.out.println(cnt);    	
    }
}