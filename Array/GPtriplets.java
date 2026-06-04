package Array;
public class GPtriplets {
    public static void triplets(int[] arr, int n){
        for(int j=1; j<n; j++){
            int i = j-1;
            //checking every possible number before j
            while(i >= 0){
                int k= j+1;
                //checking every possible number after j
                while( k<n){
                    if(arr[j]*arr[j] == arr[i]*arr[k]){
                        System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                    }
                    k++;
                }
                i--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,6,12,54,18};
        triplets(arr, 6);
    }
}
