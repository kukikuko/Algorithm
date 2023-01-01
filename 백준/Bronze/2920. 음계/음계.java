import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		String a;
		if(input.equals("1 2 3 4 5 6 7 8")) a = "ascending";
		else if(input.equals("8 7 6 5 4 3 2 1")) a = "descending";
		else a = "mixed";
		
		
		System.out.println(a);

		scan.close();

	}

}
