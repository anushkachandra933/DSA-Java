package Patterns;
public class StaircasePattern{
    public static void main(String[] args){
        int n = 6;
        //staircase pattern
        int stars = 0;
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                stars += 2;
            }
            for(int j=1; j<=stars; j++){
                System.out.print("* ");
            }
            System.out.println();
         }
    }
}