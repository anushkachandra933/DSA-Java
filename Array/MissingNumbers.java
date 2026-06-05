package Array;

public class MissingNumbers {
    public static int[] missingNumbers(int [] arr){
        int[] result = new int[arr.length+1];
        int [] freq = new int[arr.length+1];

        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }

        int k = 0;
        for(int i=0; i<freq.length; i++){
            if(freq[i] == 0){
                result[k] = i;
                k++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,1,2,1,5};
        int result[] = missingNumbers(arr);
        for(int ele : result){
            System.out.print(ele+" ");
        }
    }
}
