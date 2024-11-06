class Solution {
    public long solution(long n) {
        long answer = 0;
        int m = (int)Math.sqrt(n);
        if(Math.pow(m,2) == n) {
            return (long)Math.pow(m+1,2);
        }
        
        return -1;
        
    }
}