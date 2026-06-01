package Array;
public class LinearSearch {
    public static boolean linear_search1(int arr[],int target){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                return true;
            }
            
        }
        return false;
    }

    public static int linear_search2(int arr[],int target){
        int n = arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,9,0,4,5};
        System.out.println(linear_search2(arr, 9));
    }
}
