import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int sL = s.length();
        s = s.substring(0, 1) + s.substring(2, sL-2) + s.substring(sL-1, sL);
        System.out.print(s);
    }
}