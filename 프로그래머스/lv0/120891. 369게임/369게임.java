class Solution {
    public int solution(int order) {
        int cnt = 0;
		String a = String.valueOf(order);
		
		for(int i=0; i <a.length(); i++) {
			if(a.charAt(i) == '3' || a.charAt(i) == '6' || a.charAt(i) == '9') {
				cnt++;
			}
		} 
        return cnt;
    }
}