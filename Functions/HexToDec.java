package Functions;

public class HexToDec {
    public static int hexToDec(String hex){
        int res = 0;
        int update = 0;
        for(int i=hex.length()-1; i>=0; i--){
            int intValue;
            char ch = hex.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                intValue = (ch - 'A')+10;
            }else{
                intValue = ch - '0';
            }
            res += intValue*Math.pow(16,update);
            update++;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(hexToDec("AE8"));
    }
}
