class Solution {
    public int solution(int chicken) {
		int answer = 0;
		int service = chicken;
		int coupon = 0;
		while (true) {
			answer += service / 10;
			coupon = service % 10;
			service = service / 10 + coupon;
			if (service < 10)
				break;
		}
		return answer;
	}

}