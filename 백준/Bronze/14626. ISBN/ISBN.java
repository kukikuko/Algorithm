import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public void Solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        char[] arr = s.toCharArray();

        int sum = 0;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] != '*') sum += i % 2 == 0 ? arr[i] - '0' : (arr[i] - '0') * 3;
            else index = i;
        }

        for (int i = 0; i < 10; i++) {
            if (index % 2 == 0 && (i + sum) % 10 == 0) {
                bw.write(String.valueOf(i));
                break;
            } else if (index % 2 != 0 && (i * 3 + sum) % 10 == 0) {
                bw.write(String.valueOf(i));
                break;
            }
        }


        br.close();
        bw.flush();
        bw.close();
    }

    public static void main(String[] args) throws  Exception{
        new Main().Solution();
    }
}