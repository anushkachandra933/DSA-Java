package Array;

public class Reverse {
    public static void reverse(int[] arr,int start,int end){
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4,8,2,1,0};
        reverse(arr, 1, 3);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
