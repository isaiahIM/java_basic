package q1;

public class Q1 {
	public static void main(String[] args) {
		int cnt=1;
		int sum=0;
		
		do {
			if(cnt%2==1) {
				sum+=cnt;
			}
			
			cnt++;
		} while(cnt<=100);
		
		System.out.println("odd sum: "+ sum);
	}
}
