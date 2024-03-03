import java.util.Scanner;

public class Main {
    public static void func1(int n) {
        

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void func2(int n) {
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func1(n);
        func2(n);

    }
}