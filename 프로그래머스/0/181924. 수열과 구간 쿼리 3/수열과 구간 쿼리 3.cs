using System;

public class Solution {
    public int[] solution(int[] arr, int[,] queries) {
        int length = queries.GetLength(0);
        int[] answer = new int[arr.Length];
        
        for (int i = 0; i < length; i++)
        {
            var first = queries[i, 0];
            var second = queries[i, 1];
        
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }

        return arr;
    }
}