import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String a = scan.nextLine();
		while(!a.equals("0")) {
			int cnt = 0;
			boolean x = true;
			for(int i = a.length()-1; i>=0; i--) {
				if(a.charAt(cnt) != a.charAt(i)) {
					x = false;
					break;
				}
				cnt++;
			}
			if(x == true) System.out.println("yes");
			else System.out.println("no");
			
			a = scan.nextLine();
		}
		
		scan.close();
	}

}