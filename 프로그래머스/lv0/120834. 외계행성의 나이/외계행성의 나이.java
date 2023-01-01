class Solution {
    public String solution(int age) {
        String answer = "";
        char[] arr = String.valueOf(age).toCharArray();
		for(char c : arr) {
			answer += (char)(97+ Integer.parseInt(String.valueOf(c)));
		}
        
        return answer;
    }
}