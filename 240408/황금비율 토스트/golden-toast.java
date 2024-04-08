import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        String s = sc.next();

        // 연결 리스트 정의
        LinkedList<Character> l = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            l.add(s.charAt(i));
        }

        // Iterator 정의 (맨 끝 위치에서 시작하기 위해서는 listIterator 안에 l.size() 필요)
        ListIterator<Character> it = l.listIterator(l.size());

        while (m-- > 0) {
            char command = sc.next().charAt(0);

            if (command == 'L') {
                if (it.hasPrevious()) {
                    it.previous();
                }
            } else if (command == 'R') {
                if (it.hasNext()) {
                    it.next();
                }
            } else if (command == 'D') {
                if (it.hasNext()) {
                    it.next();
                    it.remove();
                }
            } else if (command == 'P') {
                char c = sc.next().charAt(0);
                it.add(c);
            }
        }

        // 출력
        it = l.listIterator();
        while(it.hasNext()) {
            System.out.print(it.next());
        }

    }
}