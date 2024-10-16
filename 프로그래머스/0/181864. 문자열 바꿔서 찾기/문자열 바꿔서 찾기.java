class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String revString = "";
        
        for(int i=0; i<myString.length(); i++) {
            if(myString.charAt(i) == 'A') revString += "B";
            else revString += "A";
        }
        
        if(revString.contains(pat)) return 1;
        
        return 0;
    }
}