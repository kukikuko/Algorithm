import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int max, min, n;
        
        max = min = Integer.parseInt(arr[0]);
        for(int i=1; i<arr.length; i++) {
            n = Integer.parseInt(arr[i]);
            if(min > n) min = n;
            if(max < n) max = n;
        }
        
        return min + " " + max;
    }
}