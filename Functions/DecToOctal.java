package Functions;

public class DecToOctal {
    public static int decToOctal(int num){
        int res = 0;
        int place = 1;
        while(num > 0){
            int rem = num % 8;
            res += rem * place;
            place *= 10;
            num /= 8;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(decToOctal(125));
    }
}
