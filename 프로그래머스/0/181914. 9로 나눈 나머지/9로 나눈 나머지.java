class Solution {
    public int solution(String number) {
        int answer = 0;
        
        String[] arr = number.split("");
        for(String s : arr) {
            answer += Integer.parseInt(s);
        }
        
        return answer % 9;
    }
}