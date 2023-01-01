import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int score = 1;
		int sum = 0;
		
		for(int i=1; i<=num; i++) {
			String test = scan.next();
			for(int j=0; j<test.length(); j++) {
				if(test.charAt(j) == 'O') sum += score++;
				else score = 1;
			}
			System.out.println(sum);
			sum = 0;
			score = 1;
		}
		
	} 
	
}
