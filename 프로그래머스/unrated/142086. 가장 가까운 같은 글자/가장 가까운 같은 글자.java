class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
		
		String word = ""; 
		
		for(int i=0; i<s.length(); i++) {
			int index = word.lastIndexOf(String.valueOf(s.charAt(i)));
			if(index < 0) {
				answer[i] = -1;
			} else {
				answer[i] = i - index;
			}
			word += s.charAt(i);
		}
        return answer;
    }
}