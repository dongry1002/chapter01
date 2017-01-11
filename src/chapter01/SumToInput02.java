package chapter01;

public class SumToInput02 {

	public static void main(String[] args) {
		//스캐너 말고 args에서 가져오기  java SumToInput 10 엔터
		if(args.length==0){
			System.out.println("usage: java SumToInput02 [number]");
			return;
		}
		///////// System.out.println(args[0]);//10은 String
		
		
		int number=Integer.parseInt(args[0]);
		
		//int->String 
		int n = 10;
		String s=""+n;
		String s1=String.valueOf(n);
		
		int sum=0;
		for(int i=1; i<=number;i++){
			sum+=i;
			
		}
		
		System.out.println(sum);
		
		}
		
		
		
	
	
	
}
