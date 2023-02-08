package q1;

public class Q1 {
	public static void main(String[] args) {
		
		int i, j;
		
		for(i=2; i<=8; i+=2) {
			for(j=1; j<=i+1; j++) {
				System.out.println(i + " x "+ j + " = " + i*j);
			}
			System.out.print("\n");
		}
		
		
	}
}
