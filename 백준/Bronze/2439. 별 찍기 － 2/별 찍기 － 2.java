import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int input = scanner.nextInt();
		int i = input;
			
		while(true) { 
			int j = 1;
			while(true) {
				if(i<=j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
				if(j > input) break;
			}
		i--;
		System.out.println();
		if(i < 1) break;
		}
	}

}