class Solution {
    public int[] solution(int[] arr) {
        int[]answer = new int[arr.length-1];
        if(arr.length == 1) return new int[]{-1};
        
        int min = arr[0];
	    for(int i : arr){
		    if(min > i) min = i;
	    }
	
        int index= 0;
        for(int i : arr){
		    if(i != min) answer[index++] = i;
	    }
        return answer;
    }
}