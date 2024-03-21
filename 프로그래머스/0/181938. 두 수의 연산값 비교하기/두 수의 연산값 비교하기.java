class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        int x = Integer.parseInt("" + a + b);
        
        answer = x >= 2 * a * b ? x : 2*a*b;
        
        return answer;
    }
}