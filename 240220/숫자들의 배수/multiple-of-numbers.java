import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[10];
        arr[0] = sc.nextInt();
        int cnt = 0;
        
        // 입력받은 정수의 배수를 배열에 저장
        for(int i = 1; i < 10; i++)
            arr[i] = arr[i - 1] + arr[0];
        
        // 배열의 원소들을 출력하다가 5의 배수가 2번 나오면 출력을 멈춤
        for(int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
            if(arr[i] % 5 == 0)
                cnt++;
            if(cnt >= 2)
                break;
        }
    }
}