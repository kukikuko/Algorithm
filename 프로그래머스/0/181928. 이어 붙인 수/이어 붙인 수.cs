using System;

public class Solution {
    public int solution(int[] num_list) {
        string odd = "";
        string even = "";
        
        foreach(int i in num_list)
        {
            if(i % 2 == 0) 
                even += i.ToString();
            else
                odd += i.ToString();
        }
        Console.Write(odd + " " + even);
        int answer = 0;
        return int.Parse(odd) + int.Parse(even);
    }
}