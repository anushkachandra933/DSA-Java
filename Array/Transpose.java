package Array;

public class Transpose {
    public static void swap(int[][]mat,int i,int j){
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
    public static void main(String[] args) {
        int mat[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        for(int i=0; i<mat.length; i++){
            for(int j=i+1; j<mat.length; j++){ //looping through upper triangle part
                //or we can do j=0 to i (we are looping through lower triangle part)
                swap(mat,i,j);
            }
        }

        for(int i=0; i<mat.length; i++){
            for(int j=0; j<mat.length; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    } 
}
