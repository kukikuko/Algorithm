import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
		
		for(String s : participant) {
			if(map.containsKey(s)) {
				//있는 경우
				map.put(s, map.get(s)+1);
			} else {
				//없는 경우
				map.put(s, 1);
			}
		}
		
		for(String s : completion) {
			if(map.containsKey(s)) {
				map.put(s, map.get(s)-1);
			}
		}
		
		for(String key : map.keySet()) {
			if(map.get(key) == 1) answer = key;
		}
        
        return answer;
    }
}