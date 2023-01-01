import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Solution {
    public String solution(String s) {
        String answer = "";
        List<Character> arr = new ArrayList<>();
		for(int i=0; i<s.length(); i++) {
			int cnt = 0;
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) cnt++;
			}
			if(cnt == 1) arr.add(s.charAt(i));
		}
		
		Collections.sort(arr);
		for(char c : arr) {
			answer += c;
		}
        return answer;
    }
}