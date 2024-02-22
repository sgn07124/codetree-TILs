import java.util.Scanner;

public class Main {
    public static final int MAX_N = 1000;
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[MAX_N];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int prevMaxIdx = n;

        // 첫 번째 원소가 최대가 되기 전까지 계속 반복
        while(true) {
            int maxIdx = 0;

            /**
            * 두 번째 원소부터 바로 직전 최대로 뽑힌 원소 전까지 보면서 그 중 최대 index를 갱신한다.
            * 최댓값이 여러 개인 경우 가장 왼쪽에 있는 원소가 뽑히게 된다.
            **/
            for (int i = 1; i < prevMaxIdx; i++) {
                if (a[i] > a[maxIdx]) {
                    maxIdx = i;
                }
            }
            System.out.print((maxIdx + 1) + " ");

            // 최대인 원소가 첫 번째 원소라면 종료한다.
            if (maxIdx == 0) break;

            // 바로 직전 최대 index를 갱신한다.
            prevMaxIdx = maxIdx;
        }

        
        

    }
}