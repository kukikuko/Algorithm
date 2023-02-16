class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        int x = 0;
		int y = 0;
		
		for(int[] size : sizes) {
			int max = Math.max(size[0], size[1]);
			int min = Math.min(size[0], size[1]);
			
			x = Math.max(max, x);
			y = Math.max(min, y);
		}
		answer = x * y;
        
        return answer;
    }
}