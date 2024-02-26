import java.util.Scanner;

public class Main {
    public static int func(int a, int b) {
        int res = a;
        for (int i = 1; i < b; i++) {
            res *= a;
        }
        return res;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print(func(a, b));
    }
}