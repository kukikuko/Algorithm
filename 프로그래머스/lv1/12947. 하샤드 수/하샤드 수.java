class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
		String a = String.valueOf(x); 
		int b = 0;
		for(int i=0; i<a.length(); i++) {
			b += Integer.parseInt(String.valueOf(a.charAt(i)));
		}
		
		if(x%b == 0) answer = true;
		else answer = false;

        
        return answer;
    }
}