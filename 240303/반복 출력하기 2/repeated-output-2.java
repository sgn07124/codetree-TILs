import java.util.Scanner;

public class Main {
    public static void pri(int n) {
        if (n==0) return;
        pri(n-1);
        System.out.println("HelloWorld");
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        pri(n);
    }
}