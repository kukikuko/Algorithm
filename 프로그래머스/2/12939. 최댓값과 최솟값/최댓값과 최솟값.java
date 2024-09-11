import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        int [] nums = Arrays.stream(arr).mapToInt(Integer::parseInt).toArray(); 
        Integer max = Arrays.stream(nums).max().getAsInt();
        Integer min = Arrays.stream(nums).min().getAsInt();
        return min + " " + max;
    }
}