import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int num = scanner.nextInt();
		int result = num;
		int count = 0;
		
		while(true) {
			result = (result/10 + result%10)%10 + (result%10)*10;
			count++;
			if(result == num) break;
		}
		System.out.println(count);
	} 

}