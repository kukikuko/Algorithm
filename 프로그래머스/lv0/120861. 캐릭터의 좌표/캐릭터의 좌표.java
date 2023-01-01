class Solution {
    public int[] solution(String[] keyinput, int[] board) {
		int[] answer = new int[2];

		int x = 0;
		int y = 0;

		for (String s : keyinput) {
			if (s.equals("left"))
				x -= 1;
			else if (s.equals("right"))
				x += 1;
			else if (s.equals("up"))
				y += 1;
			else if (s.equals("down"))
				y -= 1;
			if (Math.abs(x) > (board[0]) / 2) {
				if (x < 0) {
					x = (board[0]) / 2 * -1;
				} else {
					x = (board[0]) / 2;
				}
			} 
			if (Math.abs(y) > (board[1]) / 2) {
				if (y < 0) {
					y = (board[1]) / 2 * -1;
				} else {
					y = (board[1]) / 2;
				}
			}
		}
		answer[0] = x;
		answer[1] = y;
		return answer;
	}
}