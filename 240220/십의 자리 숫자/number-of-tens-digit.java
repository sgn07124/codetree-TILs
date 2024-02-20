import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        int cnt = 0;
        int count[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0) break;
            count[arr[i]/10]++;
            cnt++;
        }
        for (int i = 1; i <count.length; i++) {
            System.out.println(i + " - " + count[i]);
        }
        
        
    }
}