import java.util.ArrayList;
import java.util.List;

class Solution {
   public List<Integer> solution(int num, int total) {
        List<Integer> answer= new ArrayList<Integer>();
        
        System.out.println(total%num);
        if(total%num != 0) {
        	int min = total/num - total%num + 1;
        	for(int i=1; i<=num; i++) {
        		answer.add(min++);
        	}
        } else {
        	int min = total/num - num/2;
        	for(int i=1; i<=num; i++) {
        		answer.add(min++);
        	}
        }
        
        return answer;
    }


}