package Functions;

public class ConvertNum {

    //convert 0s of a number to 5
    public static int convert0sto5s(int num){
        int newNum = 0;
        int update = 1;
        if(num == 0){
            return 5;
        }
        while(num > 0){
            int digit = num % 10;
            if(digit == 0){
                digit = 5;
            }
            newNum = newNum+digit*update;
            update *= 10;
            num /= 10;
        }
        return newNum;
    }
    public static void main(String[] args) {
        System.out.println(convert0sto5s(00));
    }
}
