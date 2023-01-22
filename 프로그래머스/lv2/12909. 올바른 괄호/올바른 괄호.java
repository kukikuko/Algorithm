class Solution {
    boolean solution(String s) {
        boolean answer = false;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        int cnt = 0;
		char[] arr = s.toCharArray();
		for(char c : arr) {
			if(c == '(') cnt += 1;
			else cnt -= 1;
			
			if(cnt < 0) {
				return answer;
			}
		}
	
		if(cnt == 0) {
			answer = true;
		}

        return answer;
    }
}