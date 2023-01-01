import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> arr = new ArrayList<Integer>();
        for(int i : numlist) {
        	if(i%n == 0) arr.add(i);
        }
        int[] answer = new int[arr.size()];
        for(int i=0; i<arr.size(); i++) {
        	answer[i] = arr.get(i);
        }
        return answer;
    }
}