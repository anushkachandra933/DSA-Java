package Functions;

public class EvenNumSum {
    //even numbers sum from start to end
    public static int sum(int start,int end){
        short sum = 0;
        for(int i=start; i<=end; i++){
            if(i % 2 == 0){
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(20,38));
    }
}
