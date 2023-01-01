import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		int y = scan.nextInt();
		int w = scan.nextInt();
		int h = scan.nextInt();
		
		scan.close();
	
		int a = w-x;
		int b = h-y;
		
		if(x <= y && x <= a && x <= b) System.out.println(x);
		else if(y <= x && y <= a && y <= b ) System.out.println(y);
		else if(a <= x && a <= y && a <= b) System.out.println(a);
		else System.out.println(b);
	}

}
