import java.util.Arrays;
import java.util.LinkedHashSet;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        String[] arr = new String[my_string.length()];
		for(int i=0; i<my_string.length(); i++) {
			arr[i] = String.valueOf(my_string.charAt(i));
		}
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(arr));
		
		String[] resultArr = linkedHashSet.toArray(new String[0]);
		
		for(String s : resultArr) {
			answer += s;
		}
        return answer;
    }
}