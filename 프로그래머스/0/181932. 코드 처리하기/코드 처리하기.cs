using System;
using System.Text;

public class Solution {
    public string solution(string code) {
        StringBuilder sb = new StringBuilder();
        bool mode = true;

        for(int i = 0; i < code.Length; i++)
        {
            char str = code[i];
            
            if(str == '1')
                {
                    mode = !mode;
                    continue;
                }
            if(mode && (i == 0 || i % 2 == 0))
            {
                sb.Append(str);
            }
            else if(!mode && i % 2 != 0)
            {
                sb.Append(str);
            }
        }
        
        
        string answer = sb.ToString() == "" ? "EMPTY" : sb.ToString();
        return answer;
    }
}