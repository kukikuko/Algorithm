class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int index = 0;
        for(int[] ar : intervals) {
            index += ar[1] - ar[0] + 1;
        }
        
        int[] answer = new int[index];
        index = 0;
        
        for(int[] ar : intervals) {
            for(int i=ar[0]; i<=ar[1]; i++) {
                answer[index++] = arr[i];
            }
        }
        
        
        return answer;
    }
}