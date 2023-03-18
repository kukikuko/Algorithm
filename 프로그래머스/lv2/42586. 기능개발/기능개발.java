import java.util.*;
class Solution {
    public List solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
		int[] rest = new int[progresses.length];
		int day;  
		for(int i = 0; i<rest.length; i++) {
			if((100 - progresses[i]) % speeds[i] == 0) {
				day = (100 - progresses[i]) / speeds[i];
			} else day = (100 - progresses[i]) / speeds[i] + 1;
			
			rest[i] = day;
		}

		Stack<Integer> st = new Stack<>();
		int ans = 0;
		for(int i : rest) {
			if(st.empty()) {
				st.push(i);
				ans++;
			} else if(st.peek() >= i){
				ans++;
			} else {
				answer.add(ans);
				st.push(i);
				ans = 1;
			}
		}
		
		answer.add(ans);
        return answer;
    }
}