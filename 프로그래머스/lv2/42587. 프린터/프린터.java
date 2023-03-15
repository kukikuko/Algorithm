import java.util.*;
class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        int order = 0;
		boolean max;
		List<Integer> list = new ArrayList<>();
		for(int i : priorities) {
			list.add(i);
		}
		while(true) {
			max = true;
			order = list.get(0);
			for(int i : list) {
				if(order < i) {
					max = false;
					break;
				}
			}
			list.remove(0);
			if(max) {
				answer++;
				if(location == 0) break;
			} else {
				list.add(order);
				if(location == 0) location = list.size();
			}
			location--;
		}
        return answer;
    }
}