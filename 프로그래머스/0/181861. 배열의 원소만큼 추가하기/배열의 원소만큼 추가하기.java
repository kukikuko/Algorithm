class Solution {
    public int[] solution(int[] arr) {
        int index = 0;
        for(int i : arr) {
            index += i;
        }
        int[] answer = new int[index];
        index = 0;
        
        for(int i : arr) {
            for(int j=0; j<i; j++) {
                answer[index++] = i;
            }
        }
        
        return answer;
    }
}