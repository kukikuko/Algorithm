using System;

public class Solution {
    public int solution(int[] numbers) {
        Array.Sort(numbers);
        Array.Reverse(numbers);
        int answer = numbers[0] * numbers[1];
        return answer;
    }
}