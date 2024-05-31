class Solution {
    public int solution(int[] num_list) {
        int answer = -1;
        int cnt = 0;
        for(int num : num_list) {
            if(num < 0) {
                return cnt;
            }
            cnt++;
        }
        return answer;
    }
}