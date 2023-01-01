class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String s = String.valueOf(num);
		answer = s.indexOf(String.valueOf(k)) + 1;
		if(answer == 0 ) answer = -1;
        return answer;
    }
}