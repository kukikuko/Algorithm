class Solution {
    public int solution(int[] arr) {
        int answer = 0;
        for(int i = 0; i<arr.length; i++) {
			if(i == 0) answer = arr[i];
			else {
				int gcd = 0;
				int min = answer < arr[i] ? answer : arr[i];
				for(int j = 1; j<=min; j++) {
					if (answer % j == 0 && arr[i] % j == 0) gcd = j;
				}
				answer = answer * arr[i] / gcd;
			}
		}
        return answer;
    }
}