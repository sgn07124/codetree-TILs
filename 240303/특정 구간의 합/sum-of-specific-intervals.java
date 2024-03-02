import java.util.Scanner;

public class Main {
    static int a1, a2;
    static int arr[] = new int[100];
    public static int func() {
        int sum = 0;
        for (int j = a1; j <= a2; j++) {
            sum += arr[j];
        }
        return sum;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < m; i++) {
            a1 = sc.nextInt();
            a2 = sc.nextInt();
            System.out.println(func());
        }

    }
}