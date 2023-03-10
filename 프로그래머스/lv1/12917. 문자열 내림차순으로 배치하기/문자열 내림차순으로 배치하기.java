import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        int[] arr = new int[s.length()];
		for(int i=0; i<s.length(); i++) {
			arr[i] = s.charAt(i);
		}
		
		Arrays.sort(arr);
		
		for(int i=s.length()-1; i>=0; i--) {
			answer += (char)arr[i];
		}
        
        return answer;
    }
}