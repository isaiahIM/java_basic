package q3;

import java.util.*;

public class Q3 {
	public static void main(String[] args) {
		int num[]=new int[100];// 최대 100개의 숫자가 주어짐.
		int n, m;
		int swapStart, swapEnd;
		int tmp;
		int i, j;
		
		Scanner input = new Scanner(System.in);
		
		n=input.nextInt();// n 입력
		m=input.nextInt();// m 입력
		
		
		for(i=0; i<n; i++) {// 배열 초기화
			num[i]=i+1;
		}
		
		for(i=0; i<m; i++) {// swap 범위 입력
			swapStart=input.nextInt()-1;// swap 시작범위
			swapEnd=input.nextInt()-1;// swap 끝 범위
			
			/*범위내에 swap 실행*/
			while(swapStart<swapEnd) {
				tmp=num[swapStart];
				num[swapStart]=num[swapEnd];
				num[swapEnd]=tmp;
				
				swapStart++;
				swapEnd--;
			}
		}
		
		for(i=0; i<n; i++) {
			System.out.print(num[i]+" ");
		}
	}

}
