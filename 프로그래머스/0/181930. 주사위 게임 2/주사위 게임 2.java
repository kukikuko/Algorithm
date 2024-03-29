import java.util.*;
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int[] arr = {a, b, c};
        
        arr = Arrays.stream(arr).distinct().toArray();
        
        switch(arr.length) {
            case 1 : answer = 3 * a * 3 * (a*a) * 3 *(a*a*a); break;
            case 2 : answer = (a+b+c) * (a*a+b*b+c*c); break;
            case 3 : answer = a + b + c; break;
        }
        System.out.println(arr[0]);
        
        

        return answer;
    }
}