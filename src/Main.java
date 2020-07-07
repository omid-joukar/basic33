import java.util.Scanner;

/**
 * Created by KPS on 7/7/2020.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = scanner.nextInt();
        int i = 0;
        int digitsSum = 0;
        int[] sum = new int[20];
        while (number!=0){
            sum[i++] = number%10;
            number=number/10;
        }
        i--;

        while (i>=0){
            digitsSum+=sum[i--];
        }
        System.out.printf("sum of digits number : %d",digitsSum);
    }
}
