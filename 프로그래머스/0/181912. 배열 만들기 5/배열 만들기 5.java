import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(String str : intStrs) {
            int i = Integer.parseInt(str.substring(s, s+l));
            System.out.println(i);
            if(i > k) list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}