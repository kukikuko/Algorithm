class Solution {
    public String solution(String s) {
        String answer = "";
        
        int cnt = 0;
		s = s.toLowerCase();
		for(int i=0; i<s.length(); i++) {
			if(cnt % 2 == 0) {
				answer += String.valueOf(s.charAt(i)).toUpperCase();
			} else answer += String.valueOf(s.charAt(i));
			cnt++;
			if(s.charAt(i) == ' ') cnt = 0;
		}
        
        return answer;
    }
}