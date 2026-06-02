package Array;
public class Swap{
    public static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] =  arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,5,7};
        swap(arr, 1, 3);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}