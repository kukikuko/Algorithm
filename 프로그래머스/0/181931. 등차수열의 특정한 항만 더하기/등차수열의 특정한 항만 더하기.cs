using System;

public class Solution {
    public int solution(int a, int d, bool[] included) {
        int answer = 0;
        int cnt = 0;
        
        foreach(bool isTrue in included)
        {
            
            if(isTrue)
                answer += a + d * cnt;
            cnt++;
        }
        return answer;
    }
}