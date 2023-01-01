import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		scan.close();
		
		int max = 0;
		int min = 0;
		
		for(int i=1; i<=a; i++) {
			if(a%i == 0 && b%i == 0) {
				max = i;
				min = i * (a/i) * (b/i);
			}
		}
		
		System.out.println(max);
		System.out.println(min);		

	}

}