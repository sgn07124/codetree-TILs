import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String st [] = s.split(" ");
        String res = "";
        for (int i = 0; i < 10; i++) {
            res += st[i];
        }
        System.out.print(res.length());
    }
}