class Solution {
    boolean solution(String s) {
        String[] arr = s.split("");
        int index = 0;
        
        for(String st : arr) {
            if(st.equals("(")) ++index;
            else --index;
            
            if(index < 0) break;
        } 
        
        if(index == 0) return true;
        else return false;
    }
}