import java.util.Scanner;

public class Main {
    public static int plus(int a, int c) {
        return a+c;
    }
    public static int minus(int a, int c) {
        return a-c;
    }
    public static int divide(int a, int c) {
        return a/c;
    }
    public static int mul(int a, int c) {
        return a*c;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();

        if (o == '+') {
            System.out.print(a + " " + o + " " + c + " = " + plus(a, c));
        } else if (o == '-') {
            System.out.print(a + " " + o + " " + c + " = " + minus(a, c));
        } else if (o == '/') {
            System.out.print(a + " " + o + " " + c + " = " + divide(a, c));
        } else if (o == '*') {
            System.out.print(a + " " + o + " " + c + " = " + mul(a, c));
        } else {
            System.out.print("False");
        }

        
    }
}