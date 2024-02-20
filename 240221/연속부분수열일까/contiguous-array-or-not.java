import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int arr1[] = new int[100];
        int arr2[] = new int[100];

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int idx = 0;
        for (int i = 0; i < n1; i++) {
            if(arr1[i]==arr2[0]){
                for(int j=0; j<n2; j++){
                    if(i+n2>n1){
                        idx=-1;
                        break;
                    }else if(arr1[i+j]!=arr2[j]){
                        idx=-1;
                        break;
                    }
                    }
                }
            }
        if(idx==1){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
        
    }
}