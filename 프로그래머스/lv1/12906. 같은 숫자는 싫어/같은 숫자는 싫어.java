import java.util.*;

public class Solution {
    public List solution(int []arr) {
        List<Integer> answer = new ArrayList<>();
		Stack<Integer> st = new Stack<Integer>();
		for(int i : arr) {
			if(st.empty()) {
				st.push(i);
				answer.add(i);
			}
			else {
				if(st.peek() != i) {
					st.push(i);
					answer.add(i);
				}
			}
		}

        return answer;
    }
}