class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if(odd(a) && odd(b)) return a*a + b*b;
        else if(odd(a) || odd(b)) return 2*(a+b);
        return Math.abs(a-b);
    }
    
    public boolean odd(int a) {
        if(a % 2 != 0) return true;
        else return false;
    }
}