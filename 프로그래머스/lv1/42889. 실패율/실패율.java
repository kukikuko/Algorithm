import java.util.*;
class Solution {
    public List solution(int n, int[] stages) {
        List<Integer> answer = new ArrayList<>();
		Map<Integer, Double> stage = new HashMap<>();
		for(int i=1; i<=n; i++) {
			int clear = 0;
			int fail = 0;
			for(int j=0; j<stages.length; j++) {
				if(stages[j] >= i) clear++;
				if(stages[j] == i) fail++;
			}
			
			if(clear == 0) {
				stage.put(i, 0.0);
			} else {
				stage.put(i, (double)fail/clear);
			}
			
		}
		
		List<Integer> keySet = new ArrayList<>(stage.keySet());
		keySet.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return stage.get(o2).compareTo(stage.get(o1));
            }
        });

		for (int key : keySet) {
	            answer.add(key);
	       }
        return answer;
    }
}