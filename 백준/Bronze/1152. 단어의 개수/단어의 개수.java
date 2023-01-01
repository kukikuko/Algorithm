import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine().trim();
		
		String[] a = input.split(" ");
		
		if(a[0].equals("")) System.out.println(0);
		else System.out.println(a.length);

		scan.close();

	}

}
