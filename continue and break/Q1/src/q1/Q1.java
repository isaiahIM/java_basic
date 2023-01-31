package q1;

public class Q1 {
	public static void main(String[] args) {
		int cnt=1, sum=0;
		
		while(true) {
			sum+=cnt;
			
			if(sum>=1000) {
				break;// break를 하면 cnt+=2가 실행이 안되고 바로 반복문이 종료된다.
			}
			
			cnt+=2;// cnt+=2를 하면 다시 홀수가 된다.
		}
		
		System.out.println("num: "+ cnt);
		System.out.println("sum: "+ sum);
	}
}
