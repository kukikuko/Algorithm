using System;

public class Solution {
    public int solution(int[] sides) {
        Array.Sort(sides);
        
        int sum = sides[0] + sides[1] - sides[2];
        
        int answer = sum > 0 ? 1 : 2;
        return answer;
    }
}