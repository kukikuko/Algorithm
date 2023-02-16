class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for(int i=0; i<number.length-2; i++) {
			for(int j=i+1; j<number.length-1; j++) {
				for(int x=j+1; x<number.length; x++) {
					if(number[i] + number[j] + number[x] == 0) answer++;
				}
			}
		}
        
        return answer;
    }
}