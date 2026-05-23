package Functions;

public class Table {
    public static void table(int n){
        for(int i=1; i<11; i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }
    public static void main(String[] args) {
        table(5);
    }
}
