import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);
		int index = score.length;
		for(int i = 1; i<= score.length/m; i++) {
			for(int j = 1; j<= m; j++) {
				index--;
			}
			answer += score[index] * m;
		}
        return answer;
    }
}