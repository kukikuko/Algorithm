import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sl = s.split(" ");
		int[] i = new int[sl.length];
		int y = 0;
		
		for(String si : sl) {
			i[y] = Integer.parseInt(si);
			y++;
		}
		
		Arrays.sort(i);
		answer = i[0] + " " + i[i.length-1];
		
        return answer;
    }
}