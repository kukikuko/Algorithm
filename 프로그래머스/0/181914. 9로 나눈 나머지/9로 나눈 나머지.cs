using System;

public class Solution {
    public int solution(string number) {
        int answer = 0;
        foreach(char c in number)
        {
            answer = (answer + c - 48) % 9;
        }
        return answer;
    }
}