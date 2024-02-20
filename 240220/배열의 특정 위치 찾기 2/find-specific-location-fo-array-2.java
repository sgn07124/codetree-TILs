import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (i%2==1) sum1 += arr[i];
            if (i%2==0) sum2 += arr[i];
        }
        int result = 0;
        if (sum1 > sum2) {
            result = sum1 - sum2;
        } else {
            result = sum2 - sum1;
        }
        System.out.println(result);
    }
}