import java.util.Arrays;

class Solution {

    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
		for(int i = 0; i<commands.length; i++) {
				
			int[] b = new int[commands[i][1]-commands[i][0]+1];
			int cnt = 0;
				for(int j=commands[i][0]-1; j<commands[i][1]; j++) {
					b[cnt] = array[j];
					cnt++;
				}
				Arrays.sort(b);
				answer[i] = b[commands[i][2]-1];
			}
        return answer;
    }
}