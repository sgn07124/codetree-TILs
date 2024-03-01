import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a+b;
        String sumR = Integer.toString(sum);
        int cnt = 0;
        for (int i = 0; i < sumR.length(); i++) {
            if (sumR.charAt(i) == '1') {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}