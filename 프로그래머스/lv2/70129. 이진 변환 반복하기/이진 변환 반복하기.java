class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
		int cnt = 0;
		int zero = 0;
		while(!s.equals("1")) {
			zero += s.length();
			s = s.replaceAll("0", "");
			zero -= s.length();
			s = Integer.toBinaryString(s.length());
			cnt++;
		}
		answer[0] = cnt;
		answer[1] = zero;
        return answer;
    }
}