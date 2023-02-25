import java.util.*;
class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
		int[] temp = new int[numlist.length];
		Arrays.sort(numlist);
		for(int i=0; i<numlist.length; i++) {
			temp[i] = Math.abs(n - numlist[i]);
		}
		
		int cnt = 0;
		int index = 0;
		while(answer[numlist.length-1] == 0) {
			for(int i=numlist.length-1; i>=0; i--) {
				if(temp[i] == cnt) {
					answer[index] = numlist[i];
					index++;
				}
			}
			cnt++;
		}
        return answer;
    }
}