class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String s = Integer.toString(n, 3);
		String t = "";
		for(int i=s.length()-1; i>=0; i--) {
			t += s.charAt(i);
		}
		answer = Integer.parseInt(t, 3);
        
        return answer;
    }
}