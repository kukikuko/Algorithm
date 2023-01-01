class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
		if(s.length() == 4 || s.length() == 6) {
			
			for(int i=0; i<s.length(); i++) {
				if('a'<= s.charAt(i) && s.charAt(i) <= 'z') {
					answer = false;
				} else if('A'<= s.charAt(i) && s.charAt(i) <= 'Z') {
					answer = false;
				}
			}
			
		} else {
			answer = false;
		}
        
        return answer;
    }
}