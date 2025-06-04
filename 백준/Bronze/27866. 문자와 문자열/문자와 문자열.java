import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public void Solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int n = Integer.parseInt(br.readLine());

        br.close();

        sb.append(s.charAt(n-1));
        System.out.println(sb);
    }


    public static void main(String[] args) throws  Exception{
        new Main().Solution();
    }
}