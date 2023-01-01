import java.util.ArrayList;
import java.util.List;

class Solution {
    public List solution(int n) {
        List<Integer> answer = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		for(int i=2; i<n; i++) {
			if(n%i == 0) temp.add(i);
		}
		
		for(int i : temp) {
			int cnt = 0;
			for(int j=2; j<=i; j++) {
				if(i%j == 0) cnt++;
			}
			if(cnt == 1) answer.add(i);
		}
		if(temp.size() == 0 ) answer.add(n);
		
        return answer;
    }
}