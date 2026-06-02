package Array;
import java.util.*;

public class Subarrays {
    public static ArrayList<ArrayList<Integer>> printSubarray(int arr[],ArrayList<ArrayList<Integer>> res ){
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                ArrayList<Integer> subArray = new ArrayList<>();
                for(int k=i; k<=j ; k++){

                    subArray.add(arr[k]);
                }
                res.add(subArray);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        printSubarray(arr, res);
        System.out.println(res);
    }
}
