import java.util.Arrays;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0; i<photo.length; i++) {
            int sum = 0;
            int index = -1;
            for(int j=0; j<photo[i].length; j++) {
                index = Arrays.asList(name).indexOf(photo[i][j]);
                if(index >= 0) sum += yearning[index];
            }
            answer[i] = sum;
        }
        
        return answer;
    }
}