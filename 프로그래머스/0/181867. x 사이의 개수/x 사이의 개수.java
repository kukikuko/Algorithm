class Solution {
    public int[] solution(String myString) {
        String ar[] = myString.split("x", -1);
        int[] answer = new int[ar.length];
        for(int i=0; i<answer.length; i++) {
            answer[i] = ar[i].length();
        }
        return answer;
    }
}