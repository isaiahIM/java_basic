package q3;

public class Q3 {
	public static void main(String[] args) {
		int num=12345;
		int bit_3;
		int bit_6;
		
		/*3th bit masking*/
		bit_3=num&0b100;
		bit_3>>=2;
		
		/*6th bit masking*/
		bit_6=num&0b100000;
		bit_6>>=5;
		
		System.out.println("third bit: "+ bit_3);
		System.out.println("sixth bit: "+ bit_6);
		
	}
}
