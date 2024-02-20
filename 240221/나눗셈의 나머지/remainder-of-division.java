import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int countarr[] = new int[10];
        int sum = 0;
        int cnt = 0;
        while(true) {
            countarr[a%b]++;
            a = a/b;
            if(a <= 1) break;
            cnt++;
        }
        for(int i = 0; i < countarr.length; i++) {
            sum += Math.pow(countarr[i], 2);
        }
        System.out.print(sum);
        


    }
}