package practice01;

public class Prob5 {

	public static int checkAnswer(char n) {

		if (n == '3' || n == '6' || n == '9') {
			return 1;
		}

		return 0;

	}

	public static void main(String[] args) {

		// 1369 숫자로 보지말고 문자로 본다. 그럼 길이 4 루프 만들고 밖에카운트 해주고 3 6 9 확인한다 돌때마다 차엣으로
		// 맞으면 카운터 플러스
		// 1 문자는 아스키 49다 . '1' 로 비교하거나 = 49 비교 같은거다.
		// 이프 3 또는 6또는 9
		// 숫자를문자열로 바꿔준다

		int count = 0;
		int value = 0;
		for (int i = 1; i <= 99; i++) {
			String s = String.valueOf(i);
			if (s.length() == 1) {

				value = checkAnswer(s.charAt(0));
				count = count + value;
			}

			else if (s.length() == 2) {
				value = checkAnswer(s.charAt(0));
				count = count + value;

				value = checkAnswer(s.charAt(1));
				count = count + value;

			}

			switch (count) {
			case 0:
				break;
			case 1:
				System.out.println(s + " 짝");
				break;
			case 2:
				System.out.println(s + " 짝짝");
				break;

			}
				
				count =0;
			
		}

	}
}