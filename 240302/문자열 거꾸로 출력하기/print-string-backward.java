import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            String s = sc.next();
            if (s.equals("END")) break;

            int len = s.length();
            String a = "";
            for (int j = len-1; j >= 0; j--) {
                a += s.charAt(j);
            }
            System.out.println(a);
        }
        
    }
}