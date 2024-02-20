import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int count[] = new int[7];

        for(int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
            count[arr[i]]++;
        }
        for (int i = 1; i < count.length; i++) {
            System.out.println(i + " - " + count[i]);
        }
    }
}