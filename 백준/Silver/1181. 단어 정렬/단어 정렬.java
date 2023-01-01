import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int N = Integer.parseInt(scan.nextLine());

		String[] arr = new String[N];

		for (int i = 0; i < N; i++) {
			arr[i] = scan.nextLine();
		}
		Arrays.sort(arr);
		
		Arrays.sort(arr, Comparator.comparing(String::length));
		System.out.println(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if(!arr[i-1].equals(arr[i])) {
				System.out.println(arr[i]);
			}
		}
		scan.close();
	}

}
