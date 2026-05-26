package Functions;

public class BinToHex {
    public static String binToHex(int n){
        int res = 0;
        int update = 0;
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int rem = n % 10;
            res += rem*Math.pow(2,update);
            update++;
            if(update == 4){
                update = 0;
                if(res > 9){
                    char hexDigit = (char)('A'+res-10);
                    sb.insert(0,hexDigit);
                }else{
                    sb.insert(0,res);
                }
                res = 0;
            }
            n /= 10;
        }

        if(update > 0){
            if(res > 9){
                char hexDigit = (char)('A'+res-10);
                sb.insert(0,hexDigit);
            }else{
                sb.insert(0,res);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(binToHex(1011111110));
    }
}
