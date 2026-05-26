package Functions;

public class DecToHex {
     public static String decToHex(int num){
        String res = "";
        while(num > 0){
            int rem = num % 16;
            if(rem > 9){
                char hexDigit = (char)('A'+rem-10);
                res = hexDigit + res; //we are not appending,we are prepending
            }else{
                res = rem + res;
            }
            num /= 16;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(decToHex(30));
    }

}
