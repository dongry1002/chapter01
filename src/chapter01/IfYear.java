package chapter01;

public class IfYear {

	public static void main(String[] args) {
		int year=2000;
		
		if(year%4==0){
			
			if(year%100==0){
				if(year%400==0){
					System.out.println("윤년입니다");
				}else{
					System.out.println("윤년이 아닙니다");
				}
				
			}else{
				System.out.println("윤년입니다");
			}
		}else{//
			System.out.println("윤년이아님");
		}
		
		
		if(year%4 !=0){
			System.out.println("윤년이아닙니다.");
		}else if(year%100 !=0){
			System.out.println("윤년입니다");
		}else if(year%400 ==0){
			System.out.println("윤년입니다");
		}else{
			System.out.println("윤년아닙니다");
		}

	}

}
