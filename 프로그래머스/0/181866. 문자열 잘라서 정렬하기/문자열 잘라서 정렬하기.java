import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        Arrays.sort(arr);
        
        List<String> list = new ArrayList<>();
        for(String s : arr) {
            if(!s.equals("")) list.add(s);
        }
        
        return list.toArray(String[]::new);
    }
}