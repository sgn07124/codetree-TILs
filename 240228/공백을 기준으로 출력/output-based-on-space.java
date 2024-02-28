import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        String c = a+b;
        String d [] = c.split(" ");

        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i]);
        }
    }
}