using System;

public class Example
{
    public static void Main()
    {
        String s;

        Console.Clear();
        s = Console.ReadLine();
        char[] charArr = s.ToCharArray();
        
        foreach(char c in charArr)
        {
            Console.Write($"{c}\n");
        }
    }
}