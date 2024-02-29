import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();  // 문자열의 길이는 항상 2로 가정
        int cnt = 0;

        for (int i = 0; i < a.length() - 1; i++) {
            if (a.substring(i, i+2).equals(b)) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}