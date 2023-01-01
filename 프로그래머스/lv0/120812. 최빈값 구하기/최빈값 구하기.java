import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int temp = 0;
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i : array) {
        	if(map.containsKey(i)) {
        		map.put(i, map.get(i)+1);
        	} else {
        		map.put(i, 1);
        	}
        }
        
        for(int i : map.keySet()) {
        	if(temp < map.get(i)) {
        		temp = map.get(i);
        		answer = i;
        	}
        }
        
        for(int i : map.values()) {
        	if(map.get(answer) == i) cnt++;
        }
        
        if(cnt > 1) answer = -1;
        
        return answer;
    }
}