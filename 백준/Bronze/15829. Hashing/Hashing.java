import java.util.Scanner;

public class Main {

	static long doF(int n) {
		long sum = 1;
		if (n == 0)
			return 1;
		else {
			for (int i = 1; i <= n; i++) {
				sum *= 31;
			}
			return sum;
		}
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String L = scan.nextLine();
		String M = scan.nextLine();
		long result = 0;

		for (int i = 0; i < Integer.parseInt(L); i++) {
			int a = M.charAt(i) - 'a' + 1;
			result += (long) a * doF(i);
		}

		System.out.println(result);

	}

}
