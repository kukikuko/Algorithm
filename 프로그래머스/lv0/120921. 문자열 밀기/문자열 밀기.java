class Solution {
   public int solution(String A, String B) {
        if(A.equals(B)) return 0;    
        int answer = 0;
        String temp = A;
        for(int i=0; i<A.length(); i++) {
        	char[] arr = temp.toCharArray();
        	String s = "";
        	s += arr[A.length()-1];
        	for(int j=0; j<A.length()-1; j++) {
        		s += arr[j];
        	}
        	answer++;
        	if(s.equals(B)) {
        		return answer;
        	}
        	temp = s;
        }
        return -1;
    }
}