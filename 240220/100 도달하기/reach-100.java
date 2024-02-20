import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        arr[1] = sc.nextInt();
        arr[0] = 1;
        int cnt = 2;
        int sum = 0;
        
        for (int i = 2; i < arr.length; i++) {
            sum = arr[i] + arr[i-1];
            
            if(sum > 100) {
                break;
            }
            sum = 0;
            arr[i] = arr[i-1] + arr[i-2];
            
            cnt++;
            
        }
        for (int i= 0; i< cnt; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}