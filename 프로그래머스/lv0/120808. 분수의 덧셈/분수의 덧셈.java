class Solution {
    public int[] solution(int denum1, int num1, int denum2, int num2) {
        int[] answer = new int[2];
        int a = 0;
        int b = 0;
        int c = 0;
        if(num1%num2==0 || num2%num1==0) {
        	if(num1 < num2) {
        		b = num2;
        		a = denum2 + (num2/num1*denum1);
        	} else {
        		b = num1;
        		a = denum1 + (num1/num2*denum2);
        	}
        } else {
        	b = num1 * num2;
        	a = denum1 * num2 + denum2 * num1;
        }
        
        for(int i=1; i<=a; i++) {
        	if(a%i==0 && b%i==0) c = i;
        }
        answer[0] = a/c;
        answer[1] = b/c;
        
        return answer;
    }
}