import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
            if( i % 2 != 0){
                sum += arr[i];
            }
            if(i % 3 == 0 && i != 0){
                sum2 += arr[i-1];
            }
        }
        double avg = sum2/3;
        System.out.print(sum + " " + avg);
        
    }
}