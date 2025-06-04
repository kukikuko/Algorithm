import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public void Solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();
        br.close();

        int n = Integer.parseInt(a) + Integer.parseInt(b) - Integer.parseInt(c);
        int m = Integer.parseInt(a+b) - Integer.parseInt(c);

        sb.append(n + "\n" + m);
        System.out.println(sb);

    }


    public static void main(String[] args) throws  Exception{
        new Main().Solution();
    }
}