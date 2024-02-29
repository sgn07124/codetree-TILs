import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ps = sc.next();
        int psl = ps.length();
        int idx = -1;

        for(int i = 0; i < s.length() - ps.length() + 1; i++) {
            if (s.substring(i, i+psl).equals(ps)) {
                idx = i;
                break;
            }
        }
        System.out.print(idx);
    }
}