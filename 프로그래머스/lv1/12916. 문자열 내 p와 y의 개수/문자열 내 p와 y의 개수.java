class Solution {
    boolean solution(String s) {
        boolean answer = false;
		
		int cntp = 0;
		int cnty = 0;
		
		s = s.toLowerCase();
		
		char[] ch = s.toCharArray();
		for(char c : ch) {
			if(c == 'p') cntp++;
			else if(c == 'y') cnty++;
 		}
		
		if(cntp == cnty) answer = true;

        return answer;
    }
}