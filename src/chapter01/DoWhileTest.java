package chapter01;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		int total = 0;
		int value =0;
		
		
		do {
			Scanner scanner=new Scanner(System.in);
			System.out.print("숫자입력해라 종료하고싶으면 0눌러  >");
			value = scanner.nextInt();
			total+=value;
			
		} while(value !=0);
		
		System.out.println(total);


	}

}
