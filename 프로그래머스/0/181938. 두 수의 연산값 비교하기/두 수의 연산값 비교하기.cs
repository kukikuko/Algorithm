using System;

public class Solution {
    public int solution(int a, int b) {
        
        int x = int.Parse(a.ToString() + b.ToString());
        int y = 2 * a * b;
        
        int answer = Math.Max(x, y);
        return answer;
    }
}