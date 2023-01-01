class Solution {

	public String solution(String[] id_pw, String[][] db) {
        String answer = "";
        
        boolean id = false;
        boolean pw = false;
        
        for(int i=0; i<db.length; i++) {
        	if(db[i][0].equals(id_pw[0])) {
        		id = true;
        		if(db[i][1].equals(id_pw[1])) {
        			pw = true;
        			break;
        		}
        	}
        }
        
        if(id && pw) answer = "login";
        else if(id) answer = "wrong pw";
        else answer = "fail";
        return answer;
    }
}