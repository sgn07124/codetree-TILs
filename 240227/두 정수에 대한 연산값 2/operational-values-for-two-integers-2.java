import java.util.Scanner;

class IntWrapper {
    int value;

    public IntWrapper(int value) {
        this.value = value;
    }
}

public class Main {

    public static void func(IntWrapper a, IntWrapper b) {
        if (a.value > b.value) {
            b.value += 10;
            a.value *= 2;
        } else if (a.value < b.value) {
            a.value += 10;
            b.value *= 2;
        }
        return;
    }
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        IntWrapper aWrapper = new IntWrapper(a);
        IntWrapper bWrapper = new IntWrapper(b);

        func(aWrapper, bWrapper);

        a = aWrapper.value;
        b = bWrapper.value;
        System.out.print(a + " " + b);
    }
}