import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();   // 정수를 관리할 ArrayList를 선언하고
        v.add(5);                                   // v : [5]
        System.out.println(v.size());               // 들어있는 데이터의 수 : 1개
        System.out.println(v.get(0));               // 0번지에 들어 있는 값 : 5

        v.add(2);                                   // v : [5, 2]
        v.add(9);                                   // v : [5, 2, 9]

        System.out.println(v.get(1));               // 1번지에 들어 있는 값 : 2
        System.out.println(v.get(2));               // 2번지에 들어 있는 값 : 9
        System.out.println(v.get(3));               // 3번지에 들어 있는 값 : 존재하지 않으므로 Error 발생
    
        // 현재 ArrayList 내에 있는 모든 데이터를 순회하기 위해서는
        // 데이터의 개수인 v.size()를 활용하여
        // 포문을 통해 순회가 가능합니다. 
        
        for(int i = 0; i < v.size(); i++)
            System.out.println(v.get(i));           // 출력 결과 : 순서대로 5 2 9

        v.remove(v.size() - 1);                     // 맨 뒤에 있는 원소를 제거합니다.

        System.out.println(v.size());               // 들어있는 데이터의 수 : 2개

        for(int i = 0; i < v.size(); i++)
            System.out.println(v.get(i));           // 출력 결과 : 순서대로 5 2
    }
}