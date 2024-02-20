import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        int arr[] = new int[100];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        

        for(int i=0; i<q; i++){
            int cnt = 0;
            int qtype = sc.nextInt();
            if(qtype==1){
                int a = sc.nextInt();
                System.out.println(arr[a-1]);
            
            }else if(qtype==2){
                int a = sc.nextInt();
                for(int j=0; j<n; j++){
                    if(arr[j]==a){
                        cnt++;
                        System.out.println(j+1);
                        break;
                    } 
                }
                if (cnt == 0) {
                    System.out.println(cnt);
                }
            }else{
                int a = sc.nextInt();
                int b = sc.nextInt();
                for(int j=a-1; j<b; j++){
                    System.out.print(arr[j]+" ");
                }
                System.out.println();
            }
        }
    }
}