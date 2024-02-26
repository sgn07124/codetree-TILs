import java.util.Scanner;

public class Main {
    public static boolean func(int m, int d) {
        if (m==2 && d>= 1 && d>= 29) {
            return false;
        } else if (m >= 1 && m <= 12 && d >= 1 && d <= 31) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();

        if (func(M, D)) {
            System.out.print("Yes");
        } else {
            System.out.print("False");
        }
    }
}