import java.util.Scanner;
//  SIEVE OF ERASTHENES
public class Day5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        for(int i = 1 ; i * i <= number ; i++){
            if(number % i == 0){
                System.out.println(i);
                if(number / i != i){
                    System.out.println(number/i);
                }
            }
        }
    }
}
