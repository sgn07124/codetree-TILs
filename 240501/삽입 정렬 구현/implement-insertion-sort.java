import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int [n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] > key) {
                    int tmp = key;
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                    key = arr[j];
                } else {
                    break;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}