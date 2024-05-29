class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int prod = 1;
        
        for(int i : num_list) {
            sum += i;
            prod *= i;
        }
        
        answer = (prod > sum*sum) ? 0 : 1;
        
        return answer;
    }
}