import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr [] = s.split(" ");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}