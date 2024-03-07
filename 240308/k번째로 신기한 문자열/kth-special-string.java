import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String T = sc.next();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        Arrays.sort(str);
        int cnt = 0;
    
        String res = "";
        for (int i = 0; i < n; i++) {
            String ex = str[i];
            
            if (ex.substring(0, T.length()).equals(T)) {
                cnt++;
            }
            if (cnt == k) {
                res = str[i];
                break;
            }
        }
        System.out.print(res);
    }
}