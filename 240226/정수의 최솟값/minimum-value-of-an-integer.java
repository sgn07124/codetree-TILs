import java.util.Scanner;

public class Main {
    public static int func(int a, int b, int c) {
        int d = Math.min(a, b);
        int res = Math.min(d, c);
        return res;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.print(func(a, b, c));
    }
}