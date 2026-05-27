package Functions;

public class GenConversion {
    //function to convert any base to decimal number
    public static int toDecimal(String num, int currBase){
        int power = 1;
        int decNum = 0;

        for(int i=num.length()-1; i>=0; i--){
            char ch = num.charAt(i);

            int intDigit;

            if(ch >= '0' && ch <= '9'){
                intDigit = ch - '0';
            }else{
                intDigit = ch-'A'+10;
            }

            decNum = decNum + intDigit*power;
            power *= currBase;
        }
        return decNum;
    }

    //function to convert decimal to any base
    public static String fromDecimal(int decimal,int targetBase){
        if(decimal == 0){
            return "0";
        }

        String result = "";
        while(decimal > 0){
            int rem = decimal % targetBase;

            //convert rem to character
            if(rem > 9){
                result = (char) (rem - 10+'A') + result;
            }else{
                result = rem + result;
            }

            decimal /= targetBase;
        }
        return result;
    }

    public static void main(String[] args) {
        int decimal = toDecimal("76", 8);
        System.out.println(fromDecimal(decimal, 16));
    }
}