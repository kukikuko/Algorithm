import java.util.Arrays;
class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String s = String.valueOf(n);
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		s = "";
		
		for(char c : ch) {
			s = c + s;
		}
		answer = Long.parseLong(s);
        
        return answer;
    }
}