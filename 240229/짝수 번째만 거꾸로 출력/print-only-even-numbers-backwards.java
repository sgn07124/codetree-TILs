import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String encoded = "";

        for (int i = s.length()-1; i >= 0; i--) {
            if (i % 2 == 1) {
                encoded += s.charAt(i);
            }
        }
        System.out.print(encoded);
    }
}