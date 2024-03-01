import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            sum += a;
        }
        String sumS = Integer.toString(sum);
        int len = sumS.length();
        String res = sumS.substring(1, len) + sumS.substring(0, 1);
        System.out.print(res);
    }
}