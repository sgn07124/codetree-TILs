import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int cnt1 = 0;
        int cnt2 = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= 48 && a.charAt(i) <= 57) {
                cnt1++;
            } else break;
        }
    
        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) >= 48 && b.charAt(i) <= 57) {
                cnt2++;
            } else break;
        }

        String res1 = a.substring(0, cnt1);
        String res2 = b.substring(0, cnt2);

        int res1str = Integer.parseInt(res1);
        int res2str = Integer.parseInt(res2);

        System.out.print(res1str + res2str);
    }
}