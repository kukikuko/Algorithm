class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] arr = my_string.split(" ");
		for(int i=1; i<arr.length; i++) {
			if(arr[i-1].equals("+")) answer += Integer.parseInt(arr[i]);
			else if(arr[i-1].equals("-")) answer -= Integer.parseInt(arr[i]);
		}
		answer += Integer.parseInt(arr[0]);
        return answer;
    }
}