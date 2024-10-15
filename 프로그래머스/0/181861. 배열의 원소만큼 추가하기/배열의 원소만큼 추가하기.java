class Solution {
    public int[] solution(int[] arr) {
        int length = 0;
        for(int num : arr) {
            length += num;
        }
        
        int[] answer = new int[length];
        int index = 0;
        
        for(int num : arr) {
            for(int i=0; i<num; i++) answer[index++] = num;
        }
        
        return answer;
    }
}