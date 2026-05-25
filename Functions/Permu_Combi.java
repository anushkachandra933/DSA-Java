package Functions;

public class Permu_Combi {
    //factorial of number
    public static long fact(int num){
        long fact = 1;
        for(int i=1; i<=num; i++){
            fact *= i;
        }
        return fact;
    }
    //combination
    public static long nCr(int n, int r){
        return fact(n)/(fact(n-r)*fact(r));
    }
    //permutation
    public static long nPr(int n, int r){
        return fact(n)/fact(n-r);
    }

    public static void main(String[] args) {
        System.out.println("Combination:"+nCr(10, 5));

        System.out.println("Permutation:"+nPr(10,5));
    }
}
