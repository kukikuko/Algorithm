class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int cnt = 1;
        
        System.out.println(1/2);
        
        for(int i = 0; i < str1.length() * 2; i++) {
            if(cnt % 2 != 0) answer += str1.charAt(cnt++/2);
            else answer += str2.charAt(cnt++/2-1);
        }
        
        
        return answer;
    }
}