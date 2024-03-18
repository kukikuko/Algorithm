class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        
        double a = 0;
        for(int i : arr) {
            a += i;
        }
        
        answer = a / arr.length;
        
        return answer;
    }
}