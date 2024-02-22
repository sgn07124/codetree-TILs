import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr [] = new int[n];
        
        final int INT_MIN = Integer.MAX_VALUE;
        int maxVal = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j ++) {
                if (arr[j] - arr[i] > maxVal) {
                    maxVal = arr[j] - arr[i];
                }
            }
        }
        System.out.print(maxVal);
        
    }
}