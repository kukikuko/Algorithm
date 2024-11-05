class Solution {
    boolean solution(String s) {
        int cnt = 0;
        s = s.toLowerCase();

        char[] arr = s.toCharArray();
        for(char c :arr) {
            if(c == 'p') cnt++;
            else if(c == 'y') cnt--;
        }

        return cnt == 0 ? true : false;
    }
}