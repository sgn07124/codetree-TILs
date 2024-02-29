import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char arr [] = s.toCharArray();
        char n = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                arr[i] = arr[0];
            }
        }
        s = String.valueOf(arr);
        System.out.print(s);
    }
}