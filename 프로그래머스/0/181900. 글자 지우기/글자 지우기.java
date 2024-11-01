import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        String[] arr = my_string.split("");
        Arrays.sort(indices);
        
        for(int i=0; i<arr.length; i++) {
            if(Arrays.binarySearch(indices, i) < 0) 
                sb.append(arr[i]);
        }
        return sb.toString();
    }
}