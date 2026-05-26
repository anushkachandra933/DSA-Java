package Functions;

public class BinToOctal {
    public static String binToOctal(int n){
        int res = 0;
        int update = 0;
        StringBuilder sb = new StringBuilder();
        while(n > 0){
            int rem = n % 10;
            res += rem*Math.pow(2,update);
            update++;
            if(update == 3){
                update = 0;
                sb.insert(0,res);
                res = 0;
            }
            n /= 10;
        }

        if(update > 0){
            sb.insert(0,res);
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(binToOctal(110011));
    }
}
