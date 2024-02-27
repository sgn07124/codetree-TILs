import java.util.Scanner;

public class Main {
    public static void func(int arr1[], int n) {
        for (int i = 0; i<n; i++) {
            if(arr1[i] % 2== 0) {
                arr1[i] = arr1[i]/2;
            }
        }
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr1[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        func(arr1, n);
        for(int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}