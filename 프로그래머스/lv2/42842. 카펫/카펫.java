class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
		int a = brown + yellow;
		int x = 0;
		int y = 0;
		for(int i=3; i <= Math.sqrt(a); i++) {
			x = a/i;
			y = i;
			if(a % i == 0 && (x+y) * 2 -4 == brown) {
				answer[0] = x;
				answer[1] = y;
			}
		}
        return answer;
    }
}