class Solution {
    public String solution(String myString) {
        
        myString = myString.replaceAll("[^l-z]", "l");
        
        return myString;
        
//         StringBuffer sb = new StringBuffer();
        
//         for(char ch : myString.toCharArray()) {
//             if(ch < 'l') sb.append("l");
//             else sb.append(ch);
//         }
        
//         return sb.toString();
    }
}