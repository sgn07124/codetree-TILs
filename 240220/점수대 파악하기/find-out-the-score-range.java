import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int stu[] = new int[100];
        int cnt = 0;
        int score[] = new int[11];
        for (int i = 0; i < stu.length; i++) {
            stu[i] = sc.nextInt();
            if (stu[i] == 0) break;
            
            cnt++;
        }
        for(int i = 0; i < cnt; i++) {
            score[stu[i]/10]++;
        }
        for (int i = 10; i > 0; i--) {
            System.out.println(i*10 + " - " + score[i]);
        }
    }
}