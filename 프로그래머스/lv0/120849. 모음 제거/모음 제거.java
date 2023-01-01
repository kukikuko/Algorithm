class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = {'a', 'e', 'i', 'o', 'u'};
		for(int i=0; i<my_string.length(); i++) {
			String s = String.valueOf(my_string.charAt(i));
			for(int j=0; j<arr.length; j++) {
				if(my_string.charAt(i) == arr[j]) s = "";
			}
			answer += s;
		}
        return answer;
    }
}