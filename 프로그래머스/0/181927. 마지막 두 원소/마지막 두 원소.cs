using System;

public class Solution {
    public int[] solution(int[] num_list) {
        int length = num_list.Length;
        int[] answer = new int[length + 1];
        
        num_list.CopyTo(answer, 0);
        
        int a = num_list[length - 1];
        int b = num_list[length - 2];
        answer[length] = a > b ? a - b : a * 2;
        
        return answer;
    }
}