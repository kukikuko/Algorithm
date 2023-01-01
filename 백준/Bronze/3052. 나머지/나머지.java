import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[10];
		int count = 0;
		for(int i=0; i<nums.length; i++) {
			nums[i] = (scanner.nextInt()%42);
		}
		for(int i=0; i<nums.length; i++) {
			int ctl = 0;
			for(int j=i+1; j<nums.length; j++) {
				if(nums[i] == nums[j]) ctl++;
			}
			if(ctl == 0) count++;
		}
		System.out.println(count);
	}
}