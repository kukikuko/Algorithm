class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int cnt = 0;
		int answer[] = new int[num2 - num1 + 1];
		for(int i=num1; i<num2+1; i++) {
			answer[cnt] = numbers[i];
			cnt++;
		}
        return answer;
    }
}