package q2;

public class Q2 {
	public static void main(String[] args) {
		double n1, n2, n3;
		boolean result;
		
		n1=( (25+5) + (36*2)-30 )*(10.0/3.0);
		n2=( (25*3) + (36.0/3.0)-20)/5.0;
		n3=25.0/4.0;
		
		
		result= (n1>n2) && (n2>n3);
		System.out.println(result);
	}
}
