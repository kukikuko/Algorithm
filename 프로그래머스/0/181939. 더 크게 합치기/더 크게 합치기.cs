using System;

public class Solution {
    public int solution(int a, int b) {
        
        string x = String.Concat(a, b);
        string y = String.Concat(b, a);
        
        int answer = String.CompareOrdinal(x, y) > 0 ? int.Parse(x) : int.Parse(y);
        
        return answer;
    }
}