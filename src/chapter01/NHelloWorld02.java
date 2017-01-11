package chapter01;

import java.util.*;
	
public class NHelloWorld02 {

   public static void main(String[] args) {

	Scanner scanner = new Scanner( System.in );

	
	int count= scanner.nextInt();
	
	// Q: 아래 for문을  사용하여  “Hello World”를 입력 받은 수 만큼 출력 하세요.
	/*int i;
	for(i=0;i<count;i++){
		System.out.println("Hello");
	}
	System.out.println(i);*/
    		
   
   int j=0;
   while(j<count){
	   System.out.println("Hello");
	  j++;
   }
   System.out.println(j);
}
}