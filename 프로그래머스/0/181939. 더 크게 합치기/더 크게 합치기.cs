using System;

public class Solution {
    public int solution(int a, int b) {
        
        int x = int.Parse(String.Concat(a, b));
        int y = int.Parse(String.Concat(b, a));
        
        int answer = Math.Max(x, y);
        
        return answer;
    }
}