using System;

public class Solution {
    public int solution(int n) {
        bool isEven = n % 2 == 0 ? true : false;
        int answer = 0;
        
        while(n > 0)
        {
            if(isEven)
                answer += n * n;
            else 
                answer += n;
            n -= 2;
        }
        return answer;
    }
}