import java.util.ArrayList;
import java.util.List;
class Solution {
    public List solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

		int cnt = 0;
		int temp = 0;
		if(arr.length == 1) {
			answer.add(-1);
		} else {
			for(int i=0; i<arr.length; i++) {
				if(i==0) {
					temp = arr[i];
				} else {
					if(temp >= arr[i]) {
						temp = arr[i];
						cnt = i;
					}
				}
			}
			for(int i=0; i<arr.length; i++) {
				if(i != cnt) {
					answer.add(arr[i]);
				}
			}
			
		}
        return answer;
    }
}