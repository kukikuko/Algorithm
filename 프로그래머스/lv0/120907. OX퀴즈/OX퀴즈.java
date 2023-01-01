class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int j=0; j<quiz.length; j++) {
        	int a = 1;
        	int result = 0;
        	String[] arr = quiz[j].split(" ");
        	for(int i = 0; i<arr.length-2; i++) {
        		try {
        			result += a * Integer.parseInt(arr[i]);
        		} catch (Exception e) {
        			if(arr[i].equals("-")) a = -1;
        			else a = 1;
				}
        	}
        	if(result == Integer.parseInt(arr[arr.length-1])) {
        		answer[j] = "O";
        	} else answer[j] = "X";
        }
        
        return answer;
    }
}