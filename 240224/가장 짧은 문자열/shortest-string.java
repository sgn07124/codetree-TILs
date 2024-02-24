import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int maxVal = 0;
        int minVal = 21;
        for (int i = 0; i < 3; i++) {
            String a = sc.next();
            if (a.length() > maxVal) {
                maxVal = a.length();
            }
            if (a.length() < minVal) {
                minVal = a.length();
            }
        }
        int res = maxVal - minVal;
        System.out.print(res);

    }
}