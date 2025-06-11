import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public void Solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        double day = Integer.parseInt(st.nextToken());
        double night = Integer.parseInt(st.nextToken());
        double height = Integer.parseInt(st.nextToken());

        int cnt = 1;
        cnt += Math.ceil((height - day) / (day - night));

        bw.write(String.valueOf(cnt));

        br.close();
        bw.flush();
        bw.close();
    }


    public static void main(String[] args) throws  Exception{
        new Main().Solution();
    }
}