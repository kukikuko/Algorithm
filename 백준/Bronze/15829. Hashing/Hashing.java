import java.io.*;

public class Main {

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        char[] arr = br.readLine().toCharArray();

        long sum = 0L;
        long pow = 1;

        for (char ch : arr) {
            sum += (long) ((ch - 96) * pow);
            pow = (pow * 31) % 1234567891;
        }

        bw.write(Long.toString(sum % 1234567891));

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}