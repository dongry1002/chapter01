package chapter01;

public class VariableTest {
	int number;
	
	public void test(){
		int j=number+10; //인스턴스(객체변수)는 자동  초기화 		
		
	}
	public static void main(String[] args) {
		int i;
		//int i=20; 
		
		//int j=i; //지역변수는 반드시 초기화 되어야 한다.
		
		boolean isHoliday = false;
		char c = 'A'; //문자 리터럴
		char c1 = 65; // 값(아스키코드)
		byte b = 10;
		short s = 20;
		int k = 10;
		long l = 123456789;
		int j=10;
		float q = 3.14f;
		double d = 3.14;
		
		System.out.println(isHoliday);
		System.out.println(c);
		System.out.println(c1);
		System.out.println(s);
		System.out.println(k);
		System.out.println(q);
		System.out.println(d);
		
		
	}

}
