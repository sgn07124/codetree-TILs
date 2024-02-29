import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = sc.next().charAt(0);
        int n = -1;
        n = s.indexOf(c);
        if (n>=0) {
            System.out.print(n);
        } else {
            System.out.print("No");
        }
    }
}