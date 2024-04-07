import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        LinkedList<Integer> l = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            switch(s) {
                case "push_front" :
                    l.addFirst(sc.nextInt());
                    break;
                case "push_back" :
                    l.addLast(sc.nextInt());
                    break;
                case "pop_front" :
                    System.out.println(l.pollFirst());
                    break;
                case "pop_back" :
                    System.out.println(l.pollLast());
                    break;
                case "size" :
                    System.out.println(l.size());
                    break;
                case "empty" :
                    if (l.isEmpty()) {
                        System.out.println(1);
                    } else System.out.println(0);
                    break;
                case "front" :
                    System.out.println(l.peekFirst());
                    break;
                case "back" :
                    System.out.println(l.peekLast());
                    break;
            }
        }


    }
}