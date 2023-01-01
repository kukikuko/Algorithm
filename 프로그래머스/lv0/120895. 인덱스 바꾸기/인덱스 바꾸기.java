class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        char[] arr = my_string.toCharArray();
		char c = arr[num1];
		arr[num1] = arr[num2];
		arr[num2] = c;

		for(char ch : arr) {
			answer += ch;
		}
        return answer;
    }
}