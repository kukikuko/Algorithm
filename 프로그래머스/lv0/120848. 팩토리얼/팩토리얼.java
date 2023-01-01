class Solution {
    public int solution(int n) {
        int a = 1;
		int cnt = 0;
		for(int i=1; a<=n; i++) {
			a = a * i ;
			cnt++;
		}
        return cnt-1;
    }
}