import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int maxVal = 0;

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        System.out.print(maxVal);
    }
}