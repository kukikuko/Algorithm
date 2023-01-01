import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		scan.close();
		
		int x = (a/100) + (a/10%10*10) + (a%10*100);
		int y = (b/100) + (b/10%10*10) + (b%10*100);
		
		if(x >= y ) System.out.println(x);
		else System.out.println(y);

	}

}