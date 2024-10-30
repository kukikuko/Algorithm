class Solution {
    public int solution(int[] date1, int[] date2) {
        int a, b, index;
        a = b = 0;
        index = 10000;
        
        for(int i=0; i<date1.length; i++) {
            a += date1[i] * index;
            b += date2[i] * index;
            index /= 100;
        }
        
        return a >= b ? 0 : 1;
    }
}