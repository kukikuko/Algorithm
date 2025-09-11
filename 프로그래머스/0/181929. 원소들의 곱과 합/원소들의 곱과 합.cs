using System;

public class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int a = 1;
        int b = 0;
        foreach(var i in num_list)
        {
            a *= i;
            b += i;
        }
        
        return a > b * b ? 0 : 1;
    }
}