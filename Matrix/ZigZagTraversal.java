package Matrix;

public class ZigZagTraversal {
    public static void main(String[] args) {
        int matrix[][] = {{10,40,70},
                        {20,50,80},
                        {30,60,90}};

        for(int i=0; i<matrix.length; i++){
            if(i % 2 == 0){ //even row then traverse from left
                for(int j=0; j<matrix[0].length; j++){
                    System.out.print(matrix[i][j]+" ");
                }
            }else{//odd row then traverse from right
                for(int j=matrix[0].length-1; j>=0; j--){
                    System.out.print(matrix[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
