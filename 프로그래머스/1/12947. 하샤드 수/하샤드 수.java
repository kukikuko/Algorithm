class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int h = 0;
        String[] arr = String.valueOf(x).split("");
        for(String s : arr) {
            h += Integer.parseInt(s);
        }
        
        if(x % h == 0) answer = true;
        
        return answer;
    }
}