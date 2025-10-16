using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int[] solution(int[] arr) {
        List<int> stk = new List<int>();
        int i = 0;
        
        while (i < arr.Length)
        {
            if (stk.Count == 0)
                stk.Add(arr[i++]);
            else
            {
                int last = stk.Last();
                if (last < arr[i])
                    stk.Add(arr[i++]);
                else
                    stk.RemoveAt(stk.Count - 1);
            }
        }
        
        return stk.ToArray();
    }
}