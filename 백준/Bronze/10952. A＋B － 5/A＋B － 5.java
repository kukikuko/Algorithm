import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		
		while(true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			if(a == 0 && b ==0) break;			
			System.out.println(a+b);
		}
		
			
	}
}
