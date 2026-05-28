package Array;
public class SumOfArrays{
    public static int[] sumOfArrays(int arr1[], int arr2[]){
        int max = Math.max(arr1.length, arr2.length);
        int result[] = new int[max];

        for(int i=0; i<max; i++){
            int val1 = (i < arr1.length) ? arr1[i] : 0;
            int val2 = (i < arr2.length) ? arr2[i] : 0;
            result[i] = val1 + val2;
        }
        return result;
    }


    public static void main(String[] args){
        int arr1[] = {1,2,3};
        int arr2[] = {4,5};

        int result[] = sumOfArrays(arr1,arr2);
        for(int ele: result){
            System.out.print(ele+" ");
       }
    }
}