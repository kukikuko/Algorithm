class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        int i=1;
		char[] arr = cipher.toCharArray();
		for(char c : arr) {
			if(i%code == 0) answer += c;
			i++;
		}
        return answer;
    }
}