using System;
using System.Text;

public class Example
{
    public static void Main()
    {
        String s;

        Console.Clear();
        s = Console.ReadLine();
        
        char[] charArray = s.ToCharArray();
        StringBuilder sb = new StringBuilder();
        
        foreach(char c in charArray)
        {
            if('a' <= c && c <= 'z')
                sb.Append(c.ToString().ToUpper());
            else sb.Append(c.ToString().ToLower());
        }
        
        Console.Write(sb.ToString());
    }
}