import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char [] arr = s.toCharArray();
        int cnt = s.length();
        for (int i = 0; i < cnt+2; i++) {
            int a = sc.nextInt();
            int sL = s.length();
            if (a > s.length()) {
                s = s.substring(0, sL-1);
            } else {
                s = s.substring(0, a) + s.substring(a+1, s.length());
            }
            System.out.println(s);
            cnt--;
        }
        
    }   

}