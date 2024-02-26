import java.util.Scanner;

public class Main {
    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static boolean even(int num) {
        int sum = 0;
        sum = num/100 + (num%100)/10 + num%10;
        if (sum % 2 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isPrime(i) && even(i)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}