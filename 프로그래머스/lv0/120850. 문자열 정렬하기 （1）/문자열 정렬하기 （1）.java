import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Solution {
    public List solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
		
		for(int i=0; i<my_string.length(); i++) {
			if('0'<=my_string.charAt(i) && my_string.charAt(i) <= '9') {
				answer.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
			}
		}
		answer.sort(Comparator.naturalOrder());
        return answer;
    }
}