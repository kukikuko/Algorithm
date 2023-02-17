import java.util.Stack;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;

        char[] ch = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(char c : ch) {
			if(stack.empty()) {
				stack.push(c);
			} else {
				if(stack.peek() == c) {
					stack.pop();
				} else stack.push(c);
			}
		}
		if(stack.empty()) answer = 1; 

        return answer;
    }
}