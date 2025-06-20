import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Set<Integer> set = new HashSet<>();
        int length = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < length; i++) {
            int num = Integer.parseInt(st.nextToken());
            set.add(num);
        }

        length = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < length; i++) {
            int num = Integer.parseInt(st.nextToken());

            if(set.contains(num))
                bw.write("1\n");
            else bw.write("0\n");

        }

        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}