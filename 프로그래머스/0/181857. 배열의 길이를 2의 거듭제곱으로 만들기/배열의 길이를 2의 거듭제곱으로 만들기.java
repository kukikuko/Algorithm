class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        int length = 1;
        int al = arr.length;
        while(length < al) {
            length *= 2;
            cnt++;
        }
        
        if(Math.pow(2, cnt) == al) return arr;
        cnt = length-al < Math.pow(2, cnt-1)-al ? cnt-1 : cnt;
        int[] answer = new int[(int)Math.pow(2, cnt)];
        for(int i=0; i<al; i++) {
            answer[i] = arr[i];
        }
        return answer;
    }
}