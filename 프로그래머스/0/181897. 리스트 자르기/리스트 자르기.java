class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int start = 0;
        int end = num_list.length - 1;
        int index = 1;
        switch(n) {
            case 1: end = slicer[1];
                    break;
            case 2: start = slicer[0];
                    break;
            case 3: start = slicer[0];
                    end = slicer[1];
                    break;
            default: start = slicer[0];
                     end = slicer[1];
                     index = slicer[2];
                    
        }
        int[] answer = new int[(end-start)/index+1];
        int cnt = 0;
        for(int i=start; i<=end; i += index) {
            answer[cnt++] = num_list[i];
        }
        return answer;
    }
}