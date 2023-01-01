class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int cnt = 0;
		String[] arr = new String[j-i+1];
		for(int x=i; x<=j; x++) {
			arr[cnt] = String.valueOf(x);
			cnt++;
		}
		for(String s : arr) {
			for(int x=0; x<s.length(); x++) {
				if(String.valueOf(k).equals(String.valueOf(s.charAt(x)))) {
					answer++;
				}
			}
		}
        return answer;
    }
}