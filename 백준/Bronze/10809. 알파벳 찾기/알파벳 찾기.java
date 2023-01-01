import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();

		for (char i = 'a'; i <= 'z'; i++) {
			if (a.indexOf(i) != -1) {
				System.out.print(a.indexOf(i) + " ");
			} else
				System.out.print("-1 ");
		}

		scan.close();

	}

}
