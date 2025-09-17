using System;
using System.Collections.Generic;

public class Solution {
    public int[] solution(int n) {
        List<int> numbers = new List<int>();
        numbers.Add(n);
        
        while(n != 1)
        {
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            numbers.Add(n);
        }
        int[] answer = numbers.ToArray();
        return answer;
    }
}