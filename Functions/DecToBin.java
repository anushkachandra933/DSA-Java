package Functions;

public class DecToBin{
    public static int decToBin(int n){
        int newNum = 0;
        int update = 1;
        while(n > 0){
            int rem = n % 2;
            newNum += rem*update;
            update *= 10;
            n /= 2;
        }
        return newNum;
    }
    public static void main(String[] args) {
        System.out.println(decToBin(50));
    }
}