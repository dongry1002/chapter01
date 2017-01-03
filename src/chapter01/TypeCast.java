package chapter01;

public class TypeCast {

	public static void main(String[] args) {
	//(implicity)casting 암시적 캐스팅
		int i1 = 9999;
		long l1 = i1;  //안적어줘도 된다. 왜냐하면 오버안되서(오른쪽이 작은경우)
		
		//명시적(explicity) 명시적 캐스팅
		long l2=99935236789L;
		int i2=(int)l2;  //꼭 써줘야해요
	
		
		System.out.println(l1+":"+i1);
		System.out.println(l2+":"+i2);
	}

}
