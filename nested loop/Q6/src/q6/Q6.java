package q6;

public class Q6 {
	public static void main(String[] args) {
		final int N=5;// 높이
		int firstSpace, secondSpace;// 첫번째 공백, 두번째 공백
		int i, j;
		
		/*첫번째 줄*/
		firstSpace=N-1;
		for(i=0; i<firstSpace; i++) {
			System.out.print(" ");
		}
		System.out.println("*");
		
		/*두번째 줄 이상*/
		firstSpace--;
		secondSpace=1;// 두번째 공백 크기 설정
		for(i=0; i<N-1; i++) {// 천번째 줄에서 한번 출력 했으므로, N-1만큼만 반복
			
			for(j=0; j<firstSpace; j++)// 첫번째 공백
				System.out.print(" ");
			
			System.out.print("*");// 첫번째 별
			
			for(j=0; j<secondSpace; j++)// 두번째 공백
				System.out.print(" ");
			
			System.out.println("*");// 두번째 별
			
			firstSpace--;// 첫번째 공백 감소
			secondSpace+=2;// 두번째 공백 증가
		}
		
	}
}
