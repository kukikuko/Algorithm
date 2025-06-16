import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    private int[] stack;
    private int top;

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        stack = new int[size];
        top = -1;


        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push" :
                    push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop" :
                    bw.write(pop() + "\n");
                    break;
                case "size" :
                    bw.write(size() + "\n");
                    break;
                case "empty" :
                    bw.write(empty() + "\n");
                    break;
                case "top" :
                    bw.write(top() + "\n");
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private void push(int x) {
        stack[++top] = x;
    }

    private int pop() {
        return top == -1 ? -1 : stack[top--];
    }

    private int size() {
        return top + 1;
    }

    private int empty() {
        return top == -1 ? 1 : 0;
    }

    private int top() {
        return top == -1 ? -1 : stack[top];
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}