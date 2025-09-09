using System.Text.RegularExpressions;

public class Solution {
    public string solution(string my_string, string overwrite_string, int s) {
        my_string = my_string.Remove(s, overwrite_string.Length);
        string answer = my_string.Insert(s, overwrite_string);
        return answer;
    }
}