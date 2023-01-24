import java.util.*;

public class Solution {
    public List solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
		answer.add(arr[0]);
		for(int i : arr) {
			if(i != answer.get(answer.size()-1)) {
				answer.add(i);
			}
		}

        return answer;
    }
}