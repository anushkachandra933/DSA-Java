package Array;

public class ShortestDistance {
    //shortest distance between two even integers in an array
    public static int shortestDis(int arr[]){
        int dist = -1;
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 == 0){ //encountered 1st even
                for(int j=i+1; j<n; j++){
                    if(arr[j] % 2 == 0){ //encountered 2nd even
                        if(dist == -1){
                            dist = j-i; //1st distance
                        }
                        dist = Math.min(dist,j-i); // finding shortest distance by comparing with previous
                    }
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,3,5,6,8};
        System.out.println(shortestDis(arr));
    }
}
