package chapter01;

public class Swap {

	   public static void main(String[] args) {

		int n1 = 10;
		int n2 = 30;
		
		int tmp = 0;
		
		if(n2>n1){
			tmp = n2;
			n2=n1;
			n1=tmp;
					
		}

		// Q1: n1값이 항상 큰 값이 되도록, 필요할 경우 n1과 n2를 교체하라.
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);

		// Q2: 최대값을 판별하는 조건을 완성해 보세요.
		int a1 = 20;
		int a2 = 10;
		int a3 = 50;
		int max=0;
		if (a1 >= a2) {
			max=a1;
			if(max>=a3){
				System.out.println("최대값은" + max);
			}else{
				System.out.println("최대값은" +a3 );
			}
		}
		
		else {
			max=a2;
		}
		
	   }
	}
