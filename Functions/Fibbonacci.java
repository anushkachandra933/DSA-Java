package Functions;

public class Fibbonacci {
    public static void fibbo(int n){
        int first = 0;
        int second = 1;
        int next;
        System.out.print(first+" ");
        for(int i=1; i<n; i++){
            next = first+second;
            first = second;
            second = next;
        }
        if(n != 1){
            System.out.print(first+" ");
        }   
    }

    public static void main(String[] args) {
        fibbo(1);
    }
}
