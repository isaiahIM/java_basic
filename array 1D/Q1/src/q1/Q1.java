package q1;

import java.util.*;

public class Q1 {
	public static void main(String[] args) {
		int arr[]=new int[9];
		int max, maxIdx=0;
		int i;
		
		Scanner input = new Scanner(System.in);
		
		/*9개 자연수 입력기능*/
		for(i=0; i<arr.length; i++) {
			arr[i]=input.nextInt();
		}
		
		
		/*최댓값 찾는 기능*/
		max=-1;
		for(i=0; i<arr.length; i++) {
			if(max<arr[i]) {// 최댓값
				max=arr[i];// 최댓값 저장
				maxIdx=i+1;// 최댓값 인덱스 저장
			}
		}
		
		/*결과 출력*/
		System.out.println(max);
		System.out.println(maxIdx);
	}
}
