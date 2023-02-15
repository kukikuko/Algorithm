class Solution {
    public int solution(int n) {
        int answer = 0;
        
        for(int i = n+1; answer == 0; i++) {
			if(Integer.bitCount(n) == Integer.bitCount(i)) {
				answer = i;
			}
		}
        
        return answer;
    }
}