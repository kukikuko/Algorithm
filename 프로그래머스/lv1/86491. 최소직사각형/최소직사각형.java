class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int x = 0;
		int y = 0;
		
		for(int i=0; i<sizes.length; i++) {
			for(int j=0; j<2; j++) {
				if(x < sizes[i][j]) x = sizes[i][j];
			}
		}
		
		for(int i=0; i<sizes.length; i++) {
			int temp = 0;
			if(sizes[i][0] > sizes[i][1]) temp = sizes[i][1];
			else temp = sizes[i][0];
			if(temp > y) y = temp;
		}
		answer = x * y;
        
        return answer;
    }
}