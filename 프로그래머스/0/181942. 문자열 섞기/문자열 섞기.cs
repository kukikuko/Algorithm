using System;
using System.Text;

public class Solution {
    public string solution(string str1, string str2) {
        
        StringBuilder sb = new StringBuilder();
        char[] arr1 = str1.ToCharArray();
        char[] arr2 = str2.ToCharArray();
        
        for(int i = 0; i < arr1.Length; i++)
        {
            sb.Append($"{arr1[i]}{arr2[i]}");
        }
        
        return sb.ToString();
    }
}