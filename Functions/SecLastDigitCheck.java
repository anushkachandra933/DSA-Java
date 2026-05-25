package Functions;

public class SecLastDigitCheck {
    
     //check second last digit of number is even or not
    public static boolean checkSecLastDigit(int num){
        int count = 0;
        while(num > 0){
            count++;
            if(count == 2){
                int digit = num % 10;
                if(digit % 2 == 0){
                    return true;
                }
                break;
            }
            num /= 10;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkSecLastDigit(1245));
    }
}
