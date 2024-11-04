import java.util.*;
class Solution {
    public String[] solution(String myStr) {
        StringBuilder sb = new StringBuilder();
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<myStr.length(); i++) {
            String s = String.valueOf(myStr.charAt(i));
            if((s.equals("a") || s.equals("b") || s.equals("c"))) {
                if(!sb.toString().equals("")) {
                    list.add(sb.toString());
                    sb.setLength(0);
                }
            } else sb.append(s);
        }
        
        if(!sb.toString().equals("")) {
            list.add(sb.toString());
        }
        
        if(list.size() == 0) list.add("EMPTY");
        
        return list.toArray(String[]::new);
    }
}