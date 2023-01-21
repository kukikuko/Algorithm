class Solution {
    public int[] solution(int n, int m) {
       int [] answer = new int[2];
		int min = 0;
		int max = 0;
		
		if(n > m) {
			min = m;
			max = n;
		} else {
			min = n;
			max = m;
		}
		
		for(int i=1; i<=min; i++) {
			if(min % i == 0 && max % i == 0) {
				answer[0] = i;
			}
		}
		
		answer[1] = min * max / answer[0];

        return answer;
    }
}