package q4;

import java.util.*;

public class Q4 {
	public static void main(String[] args) {
		
		int minX, maxX, minY, maxY;
		int posX, posY;
		int mode=0, incX=0, incY=1;
		
		StringBuilder sb = new StringBuilder();
		
		Scanner sc=new Scanner(System.in);
		
		int size=sc.nextInt();
		int find=sc.nextInt();
		
		int arr[][]=new int[size][size];
		int num=size*size;
		
		/*시작 위치 설정*/
		posX=0;
		posY=0;
		
		/*범위 설정*/
		minX=0;
		minY=0;
		maxX=size-1;
		maxY=size-1;
		
		while( num>0 ) {// 종료조건
			
			while( (posX<=maxX && posX>=minX) && (posY<=maxY && posY>=minY) ) {
				arr[posY][posX]=num;
				posX+=incX;
				posY+=incY;
				num--;
				
			}
			
			mode++;
			mode%=4;
			switch(mode) {
			case 0:
				incX=0;
				incY=1;
				minY++;
				posX=minX;
				posY=minY;
				break;
				
			case 1:
				incX=1;
				incY=0;
				minX++;
				posX=minX;
				posY=maxY;
				break;
				
			case 2:
				incX=0;
				incY=-1;
				maxY--;
				posX=maxX;
				posY=maxY;
				break;
				
			case 3:
				incX=-1;
				incY=0;
				maxX--;
				posX=maxX;
				posY=minY;
				break;
				
			default:
				break;
			}
		}
		
		for(int i=0; i<size; i++) {
			for(int j: arr[i]) {
				sb.append(j+" ");
			}
			sb.append("\n");
		}
		System.out.print(sb);
		
		for(int i=0; i<size; i++) {
			for(int j=0; j<size; j++) {
				if(arr[i][j]==find) {
					System.out.println( (i+1)+" "+(j+1));
				}
			}	
		}
		
	}
}
