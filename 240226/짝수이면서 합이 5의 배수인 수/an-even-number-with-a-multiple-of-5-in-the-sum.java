import java.util.Scanner;

public class Main {
    public static boolean func(int n) {
        return n%2==0 && ((n/10)+(n%10))%5==0;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        if (func(n)) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}