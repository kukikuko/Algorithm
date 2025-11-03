using System;

public class Solution {
    public string solution(string my_string, int[] index_list) {
        string answer = "";
        char[] chArr = my_string.ToCharArray();
        
        foreach(int i in index_list)
        {
            answer += chArr[i];
        }
        
        return answer;
    }
}