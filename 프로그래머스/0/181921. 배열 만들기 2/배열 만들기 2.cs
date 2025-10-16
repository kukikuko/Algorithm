using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int[] solution(int l, int r) {
        List<int> result = new List<int>();
        int maxLen = r.ToString().Length;
        
        DFS("", l, r, maxLen, result);
        
        if(result.Count == 0)
            return new int[] {-1};
        
        result.Sort();
        return result.Distinct().ToArray();
    }
    
    private void DFS(string current, int l, int r, int maxLen, List<int> result)
    {
        if (current.Length > 0)
        {
            if (current.StartsWith("0") && current != "0")
                return;

            int val = int.Parse(current);
            if (val > r) 
                return;

            if (val >= l) 
                result.Add(val);
        }

        if (current.Length == maxLen)
            return;

        foreach (char d in new[] { '0', '5'})
        {
            if (current == "" && d == '0')
            {
                if (l <= 0 && 0 <= r)
                    result.Add(0);
                continue;
            }

            DFS(current + d, l, r, maxLen, result);
        }
    }
}