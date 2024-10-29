import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        Queue<String> qu = new LinkedList<>();
        
        for(String s : strArr) {
            if(!s.contains("ad")) {
                qu.offer(s);
                System.out.println(s);
            }
        }
        
        String[] answer = new String[qu.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = qu.poll();
        }
        
        return answer;
    }
}