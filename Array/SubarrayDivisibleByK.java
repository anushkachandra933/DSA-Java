package Array;
public class SubarrayDivisibleByK{

    public static int subarrayDivisibleByK(int[] arr,int k){
        int count = 0;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                if(sum % k == 0){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        int arr[] = {4,5,0,-2,-3,1};
        System.out.println(subarrayDivisibleByK(arr,5));
    }
}