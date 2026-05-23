package Functions;

public class VowelCheck {
    public static boolean checkVowel(char ch){
        ch = Character.toLowerCase(ch);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(checkVowel('A'));
    }
}
