import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		
		int sum = 0;
		int i = 0;
		int j = 0;
		for(i=1; i<=a; i++) {
			for(j=1; j<=a; j++) {
				if(i >= j) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		
	}
}