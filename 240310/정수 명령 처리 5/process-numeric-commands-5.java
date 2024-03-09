import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)throws IOException {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> v = new ArrayList<>();  // 동적 배열 선언

        for (int i = 0; i < n; i++) {
            String command = sc.next();

            if(command.equals("push_back")) {
                int num = sc.nextInt();
                v.add(num);
            } else if (command.equals("pop_back")) {
                v.remove(v.size()-1);
            } else if (command.equals("size")) {
                System.out.println(v.size());
            } else {
                int index = sc.nextInt();
                System.out.println(v.get(index-1));
            }

            
        }
        
    }
}