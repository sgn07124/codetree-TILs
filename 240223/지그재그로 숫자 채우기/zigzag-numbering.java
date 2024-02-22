import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[m][n];
        int sum = 0;
        
        for(int col = 0; col < m; col++) {
            if (col % 2 == 0){
                // Case 1:
                for(int row = 0; row < n; row++){
                    arr[row][col] = count;
                    count++;
                }
            }
            else {
                // Case 2:
                for(int row = n - 1; row >= 0; row--){
                    arr[row][col] = count;
                    count++;
                }
            }
        }
                
        // 출력:
        for(int row = 0; row < n; row++) {
            for(int col = 0; col < m; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}