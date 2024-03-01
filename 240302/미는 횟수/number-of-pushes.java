import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int len = A.length();
        int cnt = 0;
    

        for (int i = 0; i < len; i++) {
            A = A.charAt(len-1) + A.substring(0, len-1);
            cnt++;
            if (B.equals(A)) {
                break;
            }
            if (len == cnt) {
                break;
            }
        }
        if (cnt==len) {
            cnt = -1;
        } 
        System.out.print(cnt);
        
    }
}