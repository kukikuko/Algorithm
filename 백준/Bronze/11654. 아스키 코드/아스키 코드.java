import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		char chr = input.charAt(0); 
		System.out.println((int)chr);
		
		scanner.close();
	} 

}
