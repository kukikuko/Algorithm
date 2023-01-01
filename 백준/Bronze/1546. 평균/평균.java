import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int index = scanner.nextInt();
		double[] classNum = new double[index];
		double sum = 0;
		for(int i=0; i<classNum.length; i++) {
			classNum[i] = scanner.nextInt();
		}
		Arrays.sort(classNum);
		for(int i=0; i<classNum.length; i++) {
			classNum[i] = (classNum[i]/classNum[index-1])*100;
		}
		for (double num : classNum) {
			sum += num;
		}
		System.out.println(sum/index);
	}
}