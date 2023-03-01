import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = nums.length/2;
		
		List<Integer> poket = new ArrayList<>();
		for(int i : nums) {
			if(!poket.contains(i)) poket.add(i);
		}
		if(nums.length/2 > poket.size()) answer = poket.size();
        return answer;
    }
}