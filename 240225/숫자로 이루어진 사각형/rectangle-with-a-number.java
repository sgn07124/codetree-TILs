import java.util.Scanner;

public class Main {
    public static void func(int n) {
        int cnt = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print((cnt % 10) + " ");
                cnt++;
                if (cnt % 10 == 0) {
                    cnt++;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }
}