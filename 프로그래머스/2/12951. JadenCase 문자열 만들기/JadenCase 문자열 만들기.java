class Solution {
    public String solution(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<s.length(); i++) {
            String st = String.valueOf(s.charAt(i));
            if(i==0 || s.charAt(i-1) == ' ') {
                sb.append(st.toUpperCase());
            } else sb.append(st);
        }
        
        return sb.toString();
    }
}