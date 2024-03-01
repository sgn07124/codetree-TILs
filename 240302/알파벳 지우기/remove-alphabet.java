import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String arr1 = "";
        String arr2 = "";

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) >= '0' && a.charAt(i) <= '9') {
                arr1 += a.charAt(i);
            }
        }
       for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) >= '0' && b.charAt(i) <= '9') {
                arr2 += b.charAt(i);
            }
        }
        int res1 = Integer.parseInt(arr1);
        int res2 = Integer.parseInt(arr2);

        int sum = res1 + res2;
        System.out.print(sum);
    }
}