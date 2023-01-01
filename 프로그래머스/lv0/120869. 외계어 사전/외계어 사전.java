import java.util.Arrays;

class Solution {
   public int solution(String[] spell, String[] dic) {
        Arrays.sort(spell);
        
        for(String s : dic) {
        	if(s.length() == spell.length) {
        		int cnt = 0;
        		char[] arr = s.toCharArray();
        		Arrays.sort(arr);
        		for(int i=0; i<s.length() ;i++) {
        			if(spell[i].equals(String.valueOf(arr[i]))) cnt++;
        		}
        		if(cnt == arr.length) return 1;
        	}
        }
        
        return 2;
    }
}