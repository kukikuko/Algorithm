import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public void solution() throws Exception {
        try (
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken());

            StringBuilder sb = new StringBuilder();
            boolean[] isPrime = new boolean[last + 1];
            for (int i = 2; i <= last; i++) {
                isPrime[i] = true;
            }

            for (int i = 2; i <= Math.sqrt(last); i++) {
                if(isPrime[i]) {
                    for (int j = i * i; j <= last; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            for (int i = first; i <= last; i++) {
                if(isPrime[i]) sb.append(i + "\n");
            }

            bw.write(sb.toString());
        }
    }
    
    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}