import java.util.ArrayList;
import java.util.List;
class Solution {
  public String solution(String polynomial) {
		String answer = "";

		String[] arr = polynomial.split(" ");
		List<String> a = new ArrayList<String>();
		List<String> b = new ArrayList<String>();

		int x = 0;
		int y = 0;
		for (int i = 0; i < arr.length; i += 2) {
			if (arr[i].indexOf("x") >= 0)
				a.add(arr[i]);
			else
				b.add(arr[i]);
		}

		for (String s : a) {
			String q = s.replace("x", "");
			if (q.equals("")) {
				x++;
			} else {
				x += Integer.parseInt(q);
			}
		}

		for (String s : b) {
			y += Integer.parseInt(s);
		}

		if (x == 0) {
			answer = String.valueOf(y);
		} else if (y == 0) { 
			if(x == 1) answer = "x";
			else answer = String.valueOf(x) + "x";
		} else if (x == 1) {
			answer = "x + " + String.valueOf(y);
		} else {
			answer = String.valueOf(x) + "x + " + String.valueOf(y);
		}

		return answer;
	}
}