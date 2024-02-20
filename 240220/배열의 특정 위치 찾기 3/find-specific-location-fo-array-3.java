import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        int cnt = 0;
        while(true) {
            arr[cnt] = sc.nextInt();
            
            if (cnt == 100) break;
            if (arr[cnt] == 0) break;

            cnt++;
        }
        System.out.printf("%d", arr[cnt-1] + arr[cnt-2] + arr[cnt-3]);
    }
}