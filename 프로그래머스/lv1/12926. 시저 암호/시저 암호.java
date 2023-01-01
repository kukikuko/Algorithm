class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				answer += s.charAt(i);
			} else {
				char a = s.charAt(i);
				for(int j=1; j<=n; j++) {
					a = (char)(a + 1);
					if(a == 'z' + 1) {
						a = 'a';
					} else if (a ==  'Z' +1) {
						a = 'A';
					}
				}
				
				answer += a;
			}
		}

        
        
        return answer;
    }
}