import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();

		scan.close();

		String sum = String.valueOf(a * b * c);
		for (char i = '0'; i <= '9'; i++) {
			int cnt = 0;
			for (int j = 0; j < sum.length(); j++) {
				if (sum.charAt(j) == i) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}

	}

}
