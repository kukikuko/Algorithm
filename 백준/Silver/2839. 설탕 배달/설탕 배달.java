import java.io.*;

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int remainder = 0;
        int result = -1;

        for (int i = 0; i <= n / 5; i++) {
            remainder = n - (5 * i);
            if (remainder % 3 == 0) {
                result = i + (remainder / 3);
            }
        }

        bw.write(String.valueOf(result));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}