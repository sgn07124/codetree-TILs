import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        int maxNum = -1000;
        int minNum = 1000;

        for (int i = 0; i < 100; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 999 || arr[i] == -999) {
                break;
            }
            if (arr[i] > maxNum) {
                maxNum = arr[i];
            } 
            if (arr[i] < minNum) {
                minNum = arr[i];
            }
        }
        System.out.printf("%d %d", maxNum, minNum);
    }
}