import java.util.Scanner;

public class Main {
    public static boolean isContains(int i) {
        return i/10==3 || i/10==6 || i/10==9 || i%10==3 || i%10==6 || i%10==9;
    }
    public static boolean isThree(int i) {
        return i%3==0;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isContains(i)==true || isThree(i)==true) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}