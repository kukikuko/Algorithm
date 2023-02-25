class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int min = (a < b) ? a : b;
		for(int i=1; i<=min; i++) {
			if(a % i == 0 && b % i == 0) {
				a = a/i;
				b = b/i;
			}
		}
		for(int i=2; i<=b; i++) {
			while(b%i == 0) {
				if(!(i == 2 || i == 5)) {
					answer = 2;
				}
                b = b/i;
			}
		}
		
        return answer;
    }
}