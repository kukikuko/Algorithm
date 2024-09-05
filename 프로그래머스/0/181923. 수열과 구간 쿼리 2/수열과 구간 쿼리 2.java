class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for(int i=0; i<queries.length; i++){
            int min = -1;
            for(int j=queries[i][0]; j <= queries[i][1]; j++) {
                if(arr[j] > queries[i][2]) {
                    if(min == -1) min = arr[j];
                    else if(min > arr[j]) min = arr[j];
                }
                answer[i] = min;
            }
        }
        
        return answer;
    }
}