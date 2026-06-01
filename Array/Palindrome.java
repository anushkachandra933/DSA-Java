package Array;

public class Palindrome {
    public static boolean palindrome(int arr[]){
        int n = arr.length;
        int mid = n/2;
        for(int i=0; i<=mid; i++){
            if(arr[i] != arr[n-i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,2,1};
        System.out.println(palindrome(arr));
    }
}
