import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Please write your code here.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            //st = new StringTokenizer(br.readLine());
            String [] input = br.readLine().split(" ");
            switch (input[0]) {
                case "push_back" :
                    list.add(Integer.parseInt(input[1]));
                    break;

                case "pop_back" :
                    list.remove(list.size()-1);
                    break;

                case "size" :
                    sb.append(list.size()).append('\n');
                    break;

                case "get" :
                    sb.append(list.get(Integer.parseInt(input[1])-1)).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }
}