class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int temp = 1000;
		for(int i : array) {
			int num = Math.abs(n-i);
			if(num < temp) {
				answer = i;
				temp = num;
			} else if(num == temp) {
				if(answer > i) answer = i;
			} 
		}
        return answer;
    }
}