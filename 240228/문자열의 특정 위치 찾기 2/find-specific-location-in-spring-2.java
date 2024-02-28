import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String arr[] = new String[] {"apple", "banana", "grape", "blueberry", "orange"};

        char a = sc.next().charAt(0);
        
        int cnt = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i].charAt(2) == a || arr[i].charAt(3) == a) {
                cnt++;
                System.out.println(arr[i]);
            }
        }
        System.out.print(cnt);
    }
}