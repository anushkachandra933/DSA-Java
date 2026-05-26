package Functions;

public class OctalToDec {
    public static int octalToDec(int n){
        int res = 0;
        int update = 0;
        while(n > 0){
            int rem = n % 10;
            res += rem*Math.pow(8,update);
            update++;
            n /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(octalToDec(175));
    }
}
