import java.util.Scanner;

public class Main {
    public static boolean isContains(int t) {
        String num = Integer.toString(t);
        boolean a = false;
        for(int i = 0;i < num.length(); i++){
            if(num.charAt(i)=='3' || num.charAt(i) == '6' || num.charAt(i) == '9') {
                a = true;
                break;
            }
        }
        return a;
    }
    public static boolean isThree(int i) {
        return i%3==0;
    }

    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;
        for (int i = a; i <= b; i++) {
            if (isContains(i)==true || isThree(i)==true) {
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}