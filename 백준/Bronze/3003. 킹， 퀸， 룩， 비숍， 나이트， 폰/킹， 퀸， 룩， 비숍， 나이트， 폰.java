import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		int K = scan.nextInt();
		int Q = scan.nextInt();
		int L = scan.nextInt();
		int B = scan.nextInt();
		int N = scan.nextInt();
		int P = scan.nextInt();
		
		System.out.print(1 - K + " ");
		System.out.print(1 - Q + " ");
		System.out.print(2 - L + " ");
		System.out.print(2 - B + " ");
		System.out.print(2 - N + " ");
		System.out.print(8 - P);
				
		scan.close();
	}

}
