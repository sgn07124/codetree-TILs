import java.util.Scanner;

public class Main {
    public static void func(int a, int b) {
        int tmp;
        tmp = a;
        a = b;
        b = tmp;
        System.out.print(a + " " + b);
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        func(n, m);
    }
}