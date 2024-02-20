import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt = 0;
        int arr[] = new int[n];
        int tmp = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == 2) {
                cnt++;
                if (cnt == 3) {
                    tmp = i+1;
                }
            }
        }
        System.out.print(tmp);
    }
}