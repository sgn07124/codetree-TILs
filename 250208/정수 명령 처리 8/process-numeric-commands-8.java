import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        LinkedList<Integer> list = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            String [] input = br.readLine().split(" ");

            switch (input[0]) {
                case "push_front" :
                    list.addFirst(Integer.parseInt(input[1]));
                    break;
                case "push_back" :
                    list.addLast(Integer.parseInt(input[1]));
                    break;
                case "pop_front" :
                    sb.append(list.pollFirst()).append("\n");
                    break;
                case "pop_back" :
                    sb.append(list.pollLast()).append("\n");
                    break;
                case "size" :
                    sb.append(list.size()).append("\n");
                    break;
                case "empty" :
                    if (list.isEmpty()) sb.append(1).append('\n');
                    else sb.append(0).append('\n');
                    break;
                case "front" :
                    sb.append(list.peekFirst()).append('\n');
                    break;
                case "back" :
                    sb.append(list.peekLast()).append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}