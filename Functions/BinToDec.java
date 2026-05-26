package Functions;

public class BinToDec {
    public static int BinToDec(int n){
        int res = 0;
        int update = 0;
        while(n > 0){
            int rem = n % 10;
            res += rem*Math.pow(2,update);
            update++;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(BinToDec(110010));
    }
}
