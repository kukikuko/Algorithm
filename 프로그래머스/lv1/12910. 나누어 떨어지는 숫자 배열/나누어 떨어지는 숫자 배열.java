import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public List solution(int[] arr, int divisor) {
        
        List<Integer> answer = new ArrayList<>();
		
		Arrays.sort(arr);
		
		for(int a : arr) {
			if(a % divisor == 0) {
				answer.add(a);
			}
		}
		
		if(answer.isEmpty()) {
			answer.add(-1);
		}
        
        return answer;
    }
}