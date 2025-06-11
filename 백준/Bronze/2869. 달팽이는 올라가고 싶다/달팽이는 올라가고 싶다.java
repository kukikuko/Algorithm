import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public void Solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int height = Integer.parseInt(st.nextToken());

        int day = (height - down) / (up - down);
        if ((height - down) % (up - down) != 0)
            day++;

        bw.write(String.valueOf(day));

        br.close();
        bw.flush();
        bw.close();
    }


    public static void main(String[] args) throws  Exception{
        new Main().Solution();
    }
}