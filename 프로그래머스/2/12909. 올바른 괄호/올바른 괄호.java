class Solution {
    boolean solution(String s) {
        boolean answer = false;
        int cnt = 0;
        
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') cnt++;
            else cnt--;
            
            if(cnt < 0) break;
        }
        
        if(cnt == 0) answer = true;

        return answer;
    }
}