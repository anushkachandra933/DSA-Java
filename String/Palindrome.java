package String;

public class Palindrome {
    public static boolean palindrome(String str){
        int n = str.length();
        int mid = n/2;
        for(int i=0; i<=mid; i++){
            if(str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome("madeam"));
    }
}
