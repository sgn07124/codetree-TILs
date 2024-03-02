import java.util.Scanner;

public class Main {
    static String a, b;
    public static int func() {
        int val = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)==b.charAt(0) && a.charAt(i+1)==b.charAt(1)) {
                val = i;
                break;
            }
        }
        return val;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        int res = func();
        System.out.print(res);
        
    }
}