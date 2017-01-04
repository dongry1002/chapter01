package chapter01;

import java.util.Scanner;

public class PrimeDetect {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print(" 소수인지 판단할 숫자: ");

		int number = scanner.nextInt();

		// 판단 알고리즘
		int i;
		boolean isPrime = true;
		for (i = 2; i < number; i++) {
			if (number % i == 0) {

				isPrime = false;
			} 
			System.out.println(i);
		}

		if (isPrime == true) {
			System.out.println("소수");

		} else {
			System.out.println("소수아닙다");
		}

	}

}
