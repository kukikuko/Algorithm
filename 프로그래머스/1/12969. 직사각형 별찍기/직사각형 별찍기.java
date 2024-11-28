import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        for(int x=0; x<b; x++){
            for(int y=0; y<a; y++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}