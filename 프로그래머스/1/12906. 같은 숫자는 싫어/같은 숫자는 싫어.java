import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        List<Integer> list = new ArrayList<>();
        int index = -1;
        for(int i : arr){
            if(index != i){
                list.add(i);
                index = i;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}