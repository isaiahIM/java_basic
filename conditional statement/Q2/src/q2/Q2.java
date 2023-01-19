package q2;

public class Q2 {
	public static void main(String[] args) {
		
		float temp_F, temp_C;
		
		temp_F=85.3f;
		
		temp_C=(temp_F-32)*(5.f/9.f);
		
		System.out.println(temp_C);
		
		if(temp_C>30.f){
			System.out.println("더움");
		}
		else if(temp_C>=25.f && temp_C<30.f){
			System.out.println("따뜻함");
		}
		else if(temp_C>=20.f && temp_C<25.f){
			System.out.println("선선함");
		}
		else if(temp_C<20.f){
			System.out.println("서늘함");
		}
		
	}
}
