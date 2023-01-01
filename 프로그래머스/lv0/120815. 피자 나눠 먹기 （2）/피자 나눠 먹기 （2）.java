class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 1;
		while(true) {
			if(n*cnt%6 == 0) break;
			cnt++;
		}
		answer = n*cnt/6;
        return answer;
    }
}