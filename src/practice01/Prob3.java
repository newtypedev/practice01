package practice01;

import java.util.Scanner;

public class Prob3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("���ڸ� �Է��ϼ��� : ");
			int number = scanner.nextInt();
			int rest = number % 2;
			int start = 0;

			if (rest == 0)
				start = 2;
			else
				start = 1;

			int value = start;
			int result = 0;

			while (true) {

				if (number < value)
					break;

				result = result + value;
				value = value + 2;

			}

			System.out.println("�����: " + result);
			scanner.close();
		}
	
	}
}
