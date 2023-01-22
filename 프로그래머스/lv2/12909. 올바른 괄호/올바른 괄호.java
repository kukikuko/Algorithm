import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = false;

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        Stack<String> st = new Stack<>();
		char[] arr = s.toCharArray();
		
		for(char c : arr) {
			try {
			if(c == '(') st.add("(");
			else st.pop();
			} catch (Exception e) {
				answer = false;
                return answer;
			}
		}
		
		if(st.empty()) answer = true;

        return answer;
    }
}