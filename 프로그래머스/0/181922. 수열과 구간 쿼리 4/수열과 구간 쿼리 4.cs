using System;

public class Solution {
    public int[] solution(int[] arr, int[,] queries) {
        int[] answer = (int[])arr.Clone();
        int leng = queries.GetLength(0);
        
        for(int i = 0; i < leng; i++)
        {
            for(int j = queries[i, 0]; j <= queries[i,1]; j++)
            {
                if(j % queries[i, 2] == 0)
                    answer[j]++;
            }
        }
        
        return answer;
    }
}