package practice01;

import java.util.Scanner;

public class Prob4 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("문자열을 입력하세요:");
		String text = scanner.nextLine();
		int length = text.length();

		String result = "";

		for (int i = 0; i < length; i++) {

			char c = text.charAt(i);
			result = result + c;
			System.out.println(result);
		}

		scanner.close();

	}
}