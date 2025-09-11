using System;
using System.Text;

public class Solution {
    public string solution(int[] numLog) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < numLog.Length; i++)
        {
            int n = numLog[i] - numLog[i - 1];
            sb.Append(n == 1 ? "w" : n == 10 ? "d" :
                      n == -1 ? "s" : "a");
        }
        
        return sb.ToString();
    }
}