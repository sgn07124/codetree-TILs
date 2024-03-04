import java.util.Scanner;

public class Main {
    static int sum  = 0;
    public static int func(int n) {
        if (n == 0) return sum;

        sum += n;
        func(n-1);
        return sum;
        
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(func(n));
    }
}