import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number : ");

        int count = 0;

        int number = sc.nextInt();

        for(int i = 1 ; i * i <= number ; i++ ){
            if(number % i == 0){
                count++;
                if(number/ i != i){
                    count++;
                }
            }
        }
//        DRY RUN the example if 36 and 37 okaysss

        System.out.println(count == 2);

    }
}
