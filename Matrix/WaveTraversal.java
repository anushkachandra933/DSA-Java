package Matrix;

public class WaveTraversal {
    public static void main(String[] args) {
        int matrix[][] = {{10,40,70},
                        {20,50,80},
                        {30,60,90}};
        
        for(int i=0; i<matrix[0].length; i++){ //column
            for(int j=0; j<matrix.length; j++){ //row
                if(i % 2 == 0){ //even column then go from top to bottom
                    System.out.print(matrix[j][i]+" ");
                }else{//odd column then go from bottom to top
                    System.out.print(matrix[matrix.length-1-j][i]+" ");
                }
            }
        }
    }
}
