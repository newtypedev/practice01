package practice01;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("수를 입력 하세요 : ");
		int number = scanner.nextInt();

		int rest = number % 3;

		if (rest == 0)
			System.out.println("3의 배수 입니다");
		else
			System.out.println("3의 배수가 아닙니다");

		scanner.close();

	}
}
