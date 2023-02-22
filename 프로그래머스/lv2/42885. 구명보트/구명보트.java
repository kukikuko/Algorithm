import java.util.Arrays;
import java.util.Stack;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Stack<Integer> boat = new Stack<>();
		Arrays.sort(people);
		int min = 0;
		int max = people.length-1;
		for(int i=0; i<people.length; i++) {
			if(boat.empty()) {
				boat.push(people[min]);
				min++;
			} else {
				if(boat.peek() + people[max] <= limit) {
					answer++;
					max--;
					boat.pop();
				} else {
					answer++;
					max--;
				}
			}
		}
        if(!boat.empty()) answer++;
        return answer;
    }
}