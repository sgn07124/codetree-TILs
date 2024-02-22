import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        char arr[] = new char[] {'L', 'E', 'B', 'R', 'O', 'S'};
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
        int tmp = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a) {
                tmp = i;
                break;
            }
        }
        if (tmp == -1) {
            System.out.print("None");
        } else {
            System.out.print(tmp);
        }
    }
}