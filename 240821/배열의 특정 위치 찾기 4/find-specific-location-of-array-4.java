import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        
        int [] a = new int[10];
        int sum = 0;
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            a[i] = sc.nextInt();
            if(a[i] == 0){
                break;
            }
            cnt ++;
        }

        int ss = 0;

        for(int i = 0; i < cnt; i++){
            if(a[i] % 2 == 0){
                sum += a[i];
                ss += 1;
            }
        }
        
        System.out.printf("%d %d", ss, sum);

    }
}