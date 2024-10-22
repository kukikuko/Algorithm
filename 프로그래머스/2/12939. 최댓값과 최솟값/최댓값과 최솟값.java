import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        
        int max, min, temp;
        max = min = Integer.parseInt(arr[0]);
        for(int i=1; i<arr.length; i++){
            temp = Integer.parseInt(arr[i]);
            if(temp > max) max = temp;
            else if(temp < min) min = temp;
        }
        
        return min + " " + max;
    }
}