import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if(a.length() == b.length()) {
            System.out.print("same");
        } else {
            if (a.length() > b.length()) {
                System.out.print(a + " " + a.length());
            } else {
                System.out.print(b + " " + b.length());
            }
        }
    }
}