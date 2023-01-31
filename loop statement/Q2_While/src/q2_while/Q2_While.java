package q2_while;

public class Q2_While {
	public static void main(String[] args) {
		
		int sum1, sum2, result;
		int cnt;
		
		sum1=0;
		sum2=0;
		
		/*1~100 sum*/
		cnt=1;
		while(cnt<=100) {
			sum1+=cnt;
			cnt++;
		}
		
		/*3~33 sum*/
		cnt=3;
		while(cnt<=33) {
			sum2+=cnt;
			cnt++;
		}
		
		result=sum1-sum2;
		
		System.out.println("sum: "+ result);
	}
}
