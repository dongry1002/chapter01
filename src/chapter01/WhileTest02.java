package chapter01;

import java.util.Scanner;

public class WhileTest02 {

		public static void main(String[] args) {
			int total = 0;
			
			while(true) {
				Scanner scanner=new Scanner(System.in);
				System.out.print("숫자입력해라 종료하고싶으면 0눌러  >");
				int	value = scanner.nextInt();
				
				if(value==0){
					break;
				}
					
				total+=value;
		
			}
			
			System.out.println(total);
	}
}
