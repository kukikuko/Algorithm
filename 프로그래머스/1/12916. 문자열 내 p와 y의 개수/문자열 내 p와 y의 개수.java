class Solution {
    boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        char[] ch = s.toCharArray();
        int cnt = 0;
        
        for(char c : ch) {
            if(c == 'p') cnt++;
            else if(c == 'y') cnt--;
        }
        
        if(cnt != 0) answer = false;
        
        return answer;
    }
}