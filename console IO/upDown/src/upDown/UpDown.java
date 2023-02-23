package upDown;

import java.util.*;

public class UpDown {
	public static void main(String[] args) {
		final int randomNum;
		int userNum;
		int inputCnt=0;
		
        /*순서 1번*/
		Scanner input = new Scanner(System.in);
		
		/*random number generate(순서 2번)*/
		randomNum=(int)(Math.random()*100);
		
		while(true) {// 순서 7번
			/*input user number(순서 3번)*/
			System.out.print("input> ");
			userNum=input.nextInt();
			inputCnt++;// 순서 4번
			
			if(userNum<randomNum)// random number is bigger than user number(순서 5번)
				System.out.println("up");
			else if(userNum>randomNum)// random number is lower than user number(순서 6번)
				System.out.println("down");
			else{ //if random number and user number is equal(순서 8번)
				System.out.println("correct!");
				break;
			}
		}
		
		System.out.println("count: "+ inputCnt);
	}
}