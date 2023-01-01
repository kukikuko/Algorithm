import java.util.Arrays;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        String s = my_string.toLowerCase();
		char[] c = s.toCharArray();
		Arrays.sort(c);
		for(char ch : c) {
			answer += ch;
		}
        return answer;
    }
}