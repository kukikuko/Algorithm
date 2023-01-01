import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String a = scan.nextLine().toUpperCase();
		int x = 0;
		char z = 0;
		
		scan.close();
		
		for(char i = 'A'; i <= 'Z'; i++) {
			int cnt = 0;
			for(int j = 0; j < a.length(); j++) {
				if(i == a.charAt(j)) cnt++;
			}
			if(cnt > x) {
				x = cnt;
				z = i;
			} else if(cnt == x) {
				x = cnt;
				z = '?';
			}
		}
		
		System.out.println(z);

	}

}
