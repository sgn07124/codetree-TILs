import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int res = (int)c - 1;

        if (c == 'a') {
            System.out.print('z');
        } else {
            System.out.print((char)res);
        }
    }
}