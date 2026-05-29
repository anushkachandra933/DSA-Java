package Array;
import java.util.Arrays;
public class Subtraction {
    //subtraction of elements in array
   
   public static int[] subtraction(int[] arr1, int[] arr2){
    // Step 1: Compare arrays
    boolean negative = false;
    if(Arrays.compare(arr1, arr2) < 0){
        //swap the reference
        int[] temp = arr1;
        arr1 = arr2;
        arr2 = temp;
        negative = true;
    }
    int i = arr1.length - 1;
    int j = arr2.length - 1;
    int max = Math.max(arr1.length, arr2.length);
    int[] res = new int[max];
    int k = max - 1;

    while(i >= 0 || j >= 0){
        int a = (i >= 0) ? arr1[i] : 0; //if arr1 ends,then take remaining values as 0
        int b = (j >= 0) ? arr2[j] : 0;//if arr2 ends,then take remaining values as 0

        if(a < b){
            // borrow
            int borrowIndex = i - 1; //index from where we our borrowing 
            while(borrowIndex >= 0 && arr1[borrowIndex] == 0){
                arr1[borrowIndex] = 9;
                borrowIndex--;
            }
            if(borrowIndex >= 0) {
                arr1[borrowIndex]--;
            }
            a += 10; 
        }

        res[k] = a - b;
        i--;
        j--; 
        k--;
    }

    // remove leading zeros
    int start = 0;
    while(start < res.length - 1 && res[start] == 0){
        start++;
    }

    int ans[] = java.util.Arrays.copyOfRange(res, start, res.length); //it will return new array containing elements from res[start] to res[res.length]

    //put a negative sign before final result if 1st array is smaller than second
    if(negative){
        System.out.print("-");
    }
    return ans;
}


    public static void main(String[] args) {
        int arr1 []= {1,3,4};
        int arr2[] = {1,3,4,5};
        int result[] = subtraction(arr1, arr2);
        for(int ele:result){
            System.out.print(ele+" ");
        }
    }
}
