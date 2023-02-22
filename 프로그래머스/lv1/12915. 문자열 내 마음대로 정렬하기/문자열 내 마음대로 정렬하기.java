class Solution {
    public String[] solution(String[] strings, int n) {
        
        String[] answer = new String[strings.length];
		for(int i=0; i<strings.length; i++) {
			int cnt = 0;
			for(int j=0; j<strings.length; j++) {
				if(strings[i].charAt(n) > strings[j].charAt(n)) cnt++;
				if(strings[i].charAt(n) == strings[j].charAt(n)) {
					if(strings[i].compareTo(strings[j]) > 0) cnt++;
				}
			}
			answer[cnt] = strings[i];
		}
        
        return answer;
    }
}