class Solution {
    public int solution(int n) {
        int answer = 0;
       int[] fi = new int[n+1];
		
		for(int i=0; i<=n; i++) {
			if(i == 0) fi[i] = 0;
			else if(i == 1 || i == 2) fi[i] = 1;
			else {
				fi[i] = (fi[i-1] + fi[i-2]) % 1234567;
			}
		}
		answer = fi[n]; 
        return answer;
    }
}