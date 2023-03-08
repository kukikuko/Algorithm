import java.util.*;
class Solution {
    public List solution(int[] answers) {
        List<Integer> answer = new ArrayList<>();
		int[][] stu = {{1,2,3,4,5}, {2,1,2,3,2,4,2,5}, {3,3,1,1,2,2,4,4,5,5}};
		
		int col = 0;
		for(int i=0; i<3; i++) {
			int cnt = 0;
			int index = 0;
			for(int ans : answers) {
				if(stu[i][index] == ans) cnt++;
				index++;
				if(index == stu[i].length) index = 0;
			}
			
			if(cnt > col) {
				answer.clear();
				answer.add(i+1);
				col = cnt;
			} else if(cnt == col) {
				answer.add(i+1);
			}
			
		}
        return answer;
    }
}