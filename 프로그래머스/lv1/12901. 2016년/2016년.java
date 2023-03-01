import java.util.*;
class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String[] days = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
		List<Integer> month = new ArrayList<>(Arrays.asList(1,3,5,7,8,10,12));  		
		int day = 4;
		for(int i = 1; i<=a; i++) {
			if(i == a) day += b;
			else if(month.contains(i)) day += 31; 
			else if(i == 2) day += 29;
			else day += 30;
		}
		answer = days[day % 7];
        return answer;
    }
}