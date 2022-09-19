import java.util.Random;
import java.util.Scanner;
/**
* Java Basic HomeTask1
*
* @author Nadzeya Yashchuk
* @todo 14.09.2022
* @date 19.09.2022
*/

class HomeTask4 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int guess = -1;
        int number = 0;
        do {
            number = random.nextInt(10);
            for(int i = 0; i<3; i++) {
                System.out.print("Guess the number [0..9]: ");
                guess = scanner.nextInt();
                if (guess < number) {
                    System.out.println("Your number is less.");
                } else if (guess > number) {
                    System.out.println("Your number is bigger.");
                } else {
                    System.out.println("You are winner. You guess my number.");
                    break;
                }
            }
            if(number != guess) {
                System.out.println("You loose.");
            }
            System.out.print("Repeat game? Yes - 1, No - 0: ");
        } while (scanner.nextInt() == 1);
    }
}