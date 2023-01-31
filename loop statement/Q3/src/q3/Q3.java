package q3;

public class Q3 {
	public static void main(String[] args) {
		int cnt=0;
		
		for(int i=1; i<=1000; i++) {// 1부터 1000까지 반복
			if(i%3==0) {// 3으로 나누어 떨어지는 수
				cnt++;
			}
		}
		
		System.out.println("result: "+ cnt);
	}
}
