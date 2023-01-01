import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] temp = new int[array.length];
		int[] answer = new int[2];
		
		for(int i=0; i<array.length; i++) {
			temp[i] = array[i];
		}
		Arrays.sort(temp);
		
		for(int i=0; i<array.length; i++) {
			if(temp[temp.length-1] == array[i]) answer[1] = i;
		}
		answer[0] = temp[temp.length-1];
        return answer;
    }
}