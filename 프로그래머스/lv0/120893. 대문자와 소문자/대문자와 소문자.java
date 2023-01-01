class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = my_string.toCharArray();
		for(char c : arr) {
			if(c <= 'Z') {
				answer += (char)(c + 32);
			} else {
				answer += (char)(c - 32);
			}
		}
        return answer;
    }
}