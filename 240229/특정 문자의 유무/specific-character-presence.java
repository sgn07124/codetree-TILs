import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (s.contains("ee")) {
            System.out.print("Yes ");
        } else {
            System.out.print("No ");
        }
        if (s.contains("ab")) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}