import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		int count = scanner.nextInt();
		int i = 1;
		int sum = 0;
		while(i<=count) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			sum += (a*b);
			i++;
		}
		if(input == sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}