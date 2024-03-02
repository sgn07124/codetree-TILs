import java.util.Scanner;

public class Main {
    static String a, b;
    
    public static int func() {
        
        for (int i = 0; i <= a.length() - b.length(); i++) {
            int val = 0;
            for (int j = 0; j < b.length(); j++) {
                if (b.charAt(j) == a.charAt(i+j)) {
                    val++;
                }
            }
            if (val == b.length()) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        a = sc.next();
        b = sc.next();
        int res = func();
        System.out.print(res);
        
    }
}