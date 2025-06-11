import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public void Solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String first = br.readLine();
        String second = br.readLine();
        String third = br.readLine();

        int value = 0;
        try {
            value = Integer.parseInt(first) + 3;
        } catch (NumberFormatException e) {
        }
        try {
            value = Integer.parseInt(second) + 2;
        } catch (NumberFormatException e) {
        }
        try {
            value = Integer.parseInt(third) + 1;
        } catch (NumberFormatException e) {
        }

        if (value % 5 == 0 && value % 3 == 0) {
            bw.write("FizzBuzz");
        } else if (value % 5 == 0) {
            bw.write("Buzz");
        } else if (value % 3 == 0) {
            bw.write("Fizz");
        } else {
            bw.write(String.valueOf(value));
        }

        br.close();
        bw.flush();
        bw.close();
    }


    public static void main(String[] args) throws  Exception{
        new Main().Solution();
    }
}