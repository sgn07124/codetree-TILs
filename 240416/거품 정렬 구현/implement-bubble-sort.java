import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr [] = new int [n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        boolean check;
        do {
            check = true;
            int tmp = 0;
            for (int i = 0; i < n-1; i++) {
                if (arr[i] > arr[i+1]) {
                    tmp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = tmp;
                    check = false;
                }
            }
        } while (check == false);

        for (int i = 0; i< n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}