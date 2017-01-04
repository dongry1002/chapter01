package chapter01;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		System.out.println("몇줄? >");
		Scanner a= new Scanner(System.in);
		int b=a.nextInt();
		
		for(int i=1;i<=b;i++){
			
			for(int j=0;j<i;j++){
			
				System.out.print("*");
				
			}
			System.out.print("\n");
		}

	}

}
