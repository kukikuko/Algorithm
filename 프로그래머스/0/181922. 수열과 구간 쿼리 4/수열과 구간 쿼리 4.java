class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        for(int [] ar : queries) {
            int x = ar[0];
            int y = ar[1];
            int z = ar[2];
            
            for(int i=x; i<=y; i++) {
                if(i % z == 0) arr[i] += 1;
                
            }
        }
        
        return arr;
    }
}