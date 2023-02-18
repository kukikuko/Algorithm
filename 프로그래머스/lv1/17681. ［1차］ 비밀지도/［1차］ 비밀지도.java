class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
       String[] answer = new String[n];
		for(int i=0; i<n; i++) {
			long s1 = Long.parseLong(Long.toBinaryString(arr1[i]));
			long s2 = Long.parseLong(Long.toBinaryString(arr2[i]));
			
			String s = String.format("%0"+n+"d", s1+s2);
			String st = "";
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(j) == '0') {
					st += " ";
				} else st += "#";
			}
			answer[i] = st;
		}
        return answer;
    }
}