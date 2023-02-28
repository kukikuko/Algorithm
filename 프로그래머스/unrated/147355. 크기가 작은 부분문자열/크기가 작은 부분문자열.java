class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        for(int i=0; i<t.length(); i++) {
			try {
				long num = Long.parseLong(t.substring(i, i+p.length()));
				System.out.println(num);
				if(num <= Long.parseLong(p)) answer++;
			} catch (Exception e) {
			}
		}
        return answer;
    }
}