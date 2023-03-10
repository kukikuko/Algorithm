import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        Arrays.sort(nums);
		int max = nums[nums.length-1] + nums[nums.length-2] + nums[nums.length-3];
		boolean[] isPrime = new boolean[max+1];
		isPrime[0] = isPrime[1] = true;
		for(int i = 2; i <= Math.sqrt(max); i++) {
			if(!isPrime[i]) {
				for(int j = i*i; j<=max; j+=i) {
					isPrime[j] = true;
				}
			}
		}
		
		for(int i=0; i<nums.length-2; i++) {
			for(int j=i+1; j<nums.length-1; j++) {
				for(int k=j+1; k<nums.length; k++) {
					if(!isPrime[nums[i] + nums[j] + nums[k]]) answer++;
				}
			}
		}

        return answer;
    }
}