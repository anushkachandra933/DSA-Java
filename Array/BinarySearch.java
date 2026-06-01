package Array;
public class BinarySearch {
    public static int binarySearch(int[] arr,int key){
        int low = 0; 
        int high = arr.length-1;

        while(low <= high){
            int mid = (high+low)/2;

            if(arr[mid] == key){//found
                return mid;
            }else if(arr[mid] > key){ //search in left
                high = mid-1;
            }else{//search in right
                low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println(binarySearch(arr,3));
    }
}
