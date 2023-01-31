package q2_for;

public class Q2_For {
	public static void main(String[] args) {
		int sum1, sum2, result;
		int i;
		
		sum1=0;
		sum2=0;
		
		/*1~100 sum*/
		for(i=1; i<=100; i++) {
			sum1+=i;
		}
		
		/*3~33 sum*/
		for(i=3; i<=33; i++) {
			sum2+=i;
		}
		
		result=sum1-sum2;
		
		System.out.println("sum: "+ result);
	}
}
