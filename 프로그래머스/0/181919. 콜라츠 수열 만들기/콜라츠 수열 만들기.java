import java.util.*;
class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int cnt = 0;
        while(n != 1) {
            list.add(n);
            if(n%2==0) n /= 2;
            else n = 3 * n + 1;
        }
        
        list.add(n);
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}