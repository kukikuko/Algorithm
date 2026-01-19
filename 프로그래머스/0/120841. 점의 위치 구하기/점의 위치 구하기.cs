using System;

public class Solution {
    public int solution(int[] dot) {
        int a = dot[0];
        int b = dot[1];
        int answer = a > 0 ? b > 0 ? 1 : 4 : b > 0 ? 2 : 3;
        return answer;
    }
}