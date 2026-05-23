package Functions;

public class Shadowing {
    int a = 10;

    public static void add(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        add(5);
    }
}
