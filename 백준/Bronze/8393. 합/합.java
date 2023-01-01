import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		
		int i = 1;
		int sum = 0;
		
		while(i<=input) {
			sum += i;
			i++;
		}
		System.out.println(sum);
	}

}
