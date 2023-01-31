package q2;

public class Q2 {
	public static void main(String[] args) {
		
		int cnt=0, sum=0;
		
		for(int i=1; i<=2000; i++) {
			if(i%3==0 && i%5==0 && i%7==0) {
				cnt++;
				sum+=i;
				continue;
			}
		}
		
		System.out.println("cnt: "+ cnt);
		System.out.println("sum: "+ sum);
	}
}
