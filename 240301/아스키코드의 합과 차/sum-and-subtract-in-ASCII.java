import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        char b = sc.next().charAt(0);

        int c = (int)a + (int)b;
        int d;
        if ((int)a > (int)b) {
            d = (int)a - (int)b;
        } else {
            d = (int)b - (int)a;
        }
        

        System.out.print(c + " " + d);
    }
}