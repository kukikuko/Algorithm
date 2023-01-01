class Solution {
    public String[] solution(String my_str, int n) {
        int length = 0;
		if(my_str.length()%n == 0) {
			length = my_str.length()/n;
		} else {
			length = my_str.length()/n + 1;
		}
		String[] answer = new String[length];
		int cnt = 0;
		int temp = 1;
		String s = "";
		char[] arr = my_str.toCharArray();
		for(char c : arr) {
			if(temp%n == 0) {
				s += c;
				answer[cnt] = s;
				cnt++;
				temp = 0;
				s = "";
			} else {
			s += c;
			}
			temp++;
		}
		try {
		answer[cnt] = s;
		} catch(Exception e) {
			
		}
        return answer;
    }
}