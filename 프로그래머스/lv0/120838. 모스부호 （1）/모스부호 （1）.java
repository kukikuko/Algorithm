import java.util.HashMap;
import java.util.Map;
class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] arr = letter.split(" ");
		Map<String, String> morse = new HashMap<>() {
			{
                put(".-", "a");
                put("-...", "b");
                put("-.-.", "c");
                put("-..", "d");
                put(".", "e");
                put("..-.", "f");
                put("--.", "g");
                put("....", "h");
                put("..", "i");
                put(".---", "j");
                put("-.-", "k");
                put(".-..", "l");
                put("--", "m");
                put("-.", "n");
                put("---", "o");
                put(".--.", "p");
                put("--.-", "q");
                put(".-.", "r");
                put("...", "s");
                put("-", "t");
                put("..-", "u");
                put("...-", "v");
                put(".--", "w");
                put("-..-", "x");
                put("-.--", "y");
                put("--..", "z");
            }
		};
		
		for(String s : arr) {
			for(String s1 : morse.keySet()) {
				if(s.equals(s1)) {
					answer += morse.get(s1);
				}
			}
		}
        return answer;
    }
}