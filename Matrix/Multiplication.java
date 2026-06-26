package Matrix;
public class Multiplication{
    public static void main(String[] args) {
        int mat1[][] = {{1,2,1},{2,3,4}};
        int mat2[][] = {{2,4,0},{0,1,2},{1,1,1}};

        if(mat1[0].length != mat2.length){
            System.out.println("Multiplication of matrices is not possible");
        }else{
            int product[][] = new int[mat1.length][mat2[0].length];

            for(int i=0; i<mat1.length; i++){
                for(int j=0; j<mat2[0].length; j++){
                    int val = 0;
                    for(int k=0; k<mat1[0].length; k++){
                        val += mat1[i][k]*mat2[k][j];
                    }
                    product[i][j] = val;
                }
            }

            //print matrix
            for(int i=0; i<product.length; i++){
                for(int j=0; j<product[0].length; j++){
                    System.out.print(product[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}