import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char arr [] = s.toCharArray();
        char a = arr[0];
        char b = arr[1];

        for (int i = 0; i < arr.length; i++) {
            if (a == (arr[i])) {
                arr[i] = b;
            } else if (b == (arr[i])) {
                arr[i] = a;
            }
        }
        s = String.valueOf(arr);
        System.out.print(s);
    }
}