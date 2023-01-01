import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int cnt = 0;

		for (int i = 1; i <= N; i++) {
			boolean is = false;
			int num = s.nextInt();
			if (num > 1) {
				for (int j = 2; j < num - 1; j++) {
					if (num % j == 0) {
						is = true;
						break;
					}
				}
				if (is == false)
					cnt++;
			}
		}
		System.out.println(cnt);

		s.close();
	}

}
