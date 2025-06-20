import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    private int[] queue;
    private int top;
    private int last;

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        for (int i = 0 ; i < length; i++) {
            int result = 0;
            char[] arr = br.readLine().toCharArray();

            for (char ch : arr) {
                if(ch == '(') result++;
                else result--;

                if (result == -1) break;
            }

            if(result == 0) bw.write("YES\n");
            else bw.write("NO\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}