class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int index = 0;
        while(index >= 0) {
            if(myString.contains(pat)) answer++;
            index = myString.indexOf(pat);
            myString = myString.substring(index+1);
        }
        
        return answer;
    }
}