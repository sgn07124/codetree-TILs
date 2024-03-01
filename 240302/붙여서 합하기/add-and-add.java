import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = a + b;
        String d = b + a;
        int e = Integer.parseInt(c) + Integer.parseInt(d);

        System.out.print(e);        
    }
}