package Array;

public class MaxDistance {
    public static int maxDistance(int [] arr){
        int maxDist = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    maxDist = Math.max(maxDist,j-i);
                }
            }
        }
        return maxDist;
        
    } 

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,7,3,3};
        System.out.println(maxDistance(arr));
    }
}
