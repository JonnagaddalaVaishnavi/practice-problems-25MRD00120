class Solution {
    public boolean isPalindrome(String s) {
        String str = plainString(s.toLowerCase());
        int i = 0, j = str.length() - 1;
        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static String plainString(String a){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<a.length(); i++){
            char ch = a.charAt(i);
            if((ch>='a' && ch<='z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}