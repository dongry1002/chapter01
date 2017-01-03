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
		
		//상수
		final int MAX_SPEED=20;
		//max_speed=200;  //final이 붙은 변수는 이 후에 값 대입을 할 수 없다
		
		
		
		//스트링객체확인

		String aa= new String("Hello");
		System.out.println(aa);
		
		//String 객체를 리터럴로 사용하기
		String str1= "Hello";  //자베에서 제공해누는 것 String 사실 기본타입아니다
		System.out.println(str1);
		
	}

}
