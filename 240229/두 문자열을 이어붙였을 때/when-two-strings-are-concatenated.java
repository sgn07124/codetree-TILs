import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = a + b;
        String d = b + a;

        if (c.equals(d)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}