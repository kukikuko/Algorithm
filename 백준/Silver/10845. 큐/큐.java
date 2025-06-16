import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    private int[] queue;
    private int top;
    private int last;

    public void solution() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        queue = new int[size];
        top = -1;
        last = -1;


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
                case "front" :
                    bw.write(front() + "\n");
                    break;
                case "back" :
                    bw.write(back() + "\n");
                    break;
            }
        }

        br.close();
        bw.flush();
        bw.close();
    }

    private void push(int x) {
        queue[++last] = x;
        if (top == -1) top = 0;
    }

    private int pop() {
        return top == -1 || top > last ? -1 : queue[top++];
    }

    private int size() {
        return (top == -1 || top > last) ? 0 : last - top + 1;
    }

    private int empty() {
        return last == -1 || top > last ? 1 : 0;
    }

    private int front() {
        return top == -1 || top > last ? -1 : queue[top];
    }

    private int back() {
        return last == -1 || top > last ? -1 : queue[last];
    }

    public static void main(String[] args) throws Exception{
        new Main().solution();
    }
}