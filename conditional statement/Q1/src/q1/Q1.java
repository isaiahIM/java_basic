package q1;

public class Q1 {
	public static void main(String[] args) {
		int score=86;
		
		if(score>=91 && score<=100) {// A
			System.out.println("A");
		}
		else if(score>=81 && score<=90) {// B
			System.out.println("B");
		}
		else if(score>=71 && score<=80) {// C
			System.out.println("C");
		}
		else if(score>=61 && score<=70) {
			System.out.println("D");
		}
		else if(score<=60) {
			System.out.println("F");
		}
	}
}
