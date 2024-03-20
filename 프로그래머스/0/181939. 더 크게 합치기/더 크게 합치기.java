class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String x = a + "" + b;
        String y = b + "" + a;
        
        int q = Integer.parseInt(x);
        int p = Integer.parseInt(y);
        
        answer = q >= p ? q : p;
        
        return answer;
    }
}