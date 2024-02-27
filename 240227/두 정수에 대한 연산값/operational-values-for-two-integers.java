import java.util.Scanner;

public class Main {
    public static int big(int c) {
        return c+25;
    }
    public static int small(int d) {
        return d*2;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a > b) {
            a = big(a);
            b = small(b);
        } else if (a < b) {
            b = big(b);
            a = small(a);
        }
        System.out.print(a + " " + b);
    }
}