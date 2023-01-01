import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
       int answer = 0;
		
		char[] bArr = before.toCharArray();
		char[] aArr = after.toCharArray();
		
		Arrays.sort(bArr);
		Arrays.sort(aArr);
        
		String beforeStr = new String(bArr);
		String afterStr = new String(aArr);	
		
		if(beforeStr.equals(afterStr)) {
			answer = 1;
		} else { 
			answer = 0;
		}
        
        return answer;
    }
}