using System;

public class Solution {
    public int[] solution(int[] arr, int[,] queries) {
        int length = queries.GetLength(0);
        int[] answer = new int[length];
        
        for(int i = 0; i < length; i++)
        {
            int min = -1;
            for(int j = queries[i, 0]; j <= queries[i, 1]; j++)
            {
                if(queries[i, 2] < arr[j])
                {
                    min = min == -1 ? arr[j] : Math.Min(min, arr[j]);
                }
            }
            answer[i] = min;
        }
        
        return answer;
    }
}