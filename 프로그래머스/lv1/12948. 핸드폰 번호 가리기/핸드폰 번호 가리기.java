class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        String a = phone_number.substring(0, phone_number.length()-4);
		
		a = a.replaceAll("[0-9]", "*");
		answer = a + phone_number.substring(phone_number.length()-4);
        
        return answer;
    }
}