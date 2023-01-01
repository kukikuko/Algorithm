class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = "";
		char[] arr = my_string.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(i==arr.length-1 && '0' <= arr[i] && arr[i] <= '9') {
				temp += arr[i];
				answer += Integer.parseInt(temp);
			} else if('0' <= arr[i] && arr[i] <= '9') {
				if('0' <= arr[i+1] && arr[i+1] <= '9') {
					temp += arr[i];
				} else {
					temp += arr[i];
					answer += Integer.parseInt(temp);
					temp = "";
				}
			}
		}
        return answer;
    }
}