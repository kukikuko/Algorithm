class Solution {
    public int solution(int num) {
        		int cnt = 0;

        long n = num;
        
		while (n != 1) {
			if (n % 2 == 0) {
				n = n / 2;
			} else if (n % 2 != 0) {
				n = n * 3 + 1;
			}

			cnt++;
		}

		if(cnt >= 500) {
			cnt = -1;
		}
        return cnt;
    }
}