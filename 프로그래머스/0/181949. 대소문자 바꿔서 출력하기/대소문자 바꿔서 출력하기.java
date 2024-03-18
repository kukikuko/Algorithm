import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        
        char[] c = a.toCharArray();
        for(int i = 0; i < c.length; i++) {
            if('a'<= c[i] && c[i] <= 'z') {
                System.out.print(String.valueOf(c[i]).toUpperCase());
            } else System.out.print(String.valueOf(c[i]).toLowerCase());
        }
    }
}