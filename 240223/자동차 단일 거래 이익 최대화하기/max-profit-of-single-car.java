import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr [] = new int[1000];
        
        final int INT_MIN = Integer.MAX_VALUE;
        int minVal = INT_MIN;
        int minIdx = 0;
        int maxVal = 0;
        int maxIdx = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (minVal > arr[i]) {
                minVal = arr[i];
                minIdx = i;
            }
        }
        
        for (int i = minIdx; i < n; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
                maxIdx = i;
            }
        }
        int total = maxVal - minVal;
        System.out.print(total);
        
    }
}