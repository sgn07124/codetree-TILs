import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        String A = sc.next();

        String encoded = "";  // 변환

        // 입력의 첫번째 값을 읽고 초기화
        char currChar = A.charAt(0);
        int numChar = 1;
        for (int i = 1; i < A.length(); i++) {
            if (A.charAt(i) == currChar) {  // 지금까지의 문자와 같으면 연속된 문자 개수만 추가해주고 넘어간다.
                numChar++;  
            } else {
                // 지금까지의 문자와 다르면 새로운 문자로 바꿔준다. encoded에 지금까지 세어온 currChar와 numChar를 기록한다.
                encoded += currChar;
                encoded += Integer.toString(numChar);  // 문자열로 붙여야됨
                // currChar와 numChar를 현재 값으로 초기화
                currChar = A.charAt(i);
                numChar = 1;
            }
        }
        // 마지막 덩어리에 해당하는 currChar와 numChar를 기록한다.
        encoded += currChar;
        encoded += Integer.toString(numChar);

        System.out.println(encoded.length());
        System.out.println(encoded);

    }
}