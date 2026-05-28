package Functions;
import java.util.Scanner;

public class NumberGuess {
    public static void numberGuessgame(int input,int target){
        if(input > target){
            System.out.println("Try Again! You guessed too high");
        }else if(input < target){
            System.out.println("Try Again! You guessed too low");
        }else{
            System.out.println("Congratulations!");
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        int target = (int)(Math.random()*101);
        while(true){
            System.out.print("Enter any number in range 1-100: ");
            int input = sc.nextInt();
            numberGuessgame(input, target);
        }
        
    }
}
