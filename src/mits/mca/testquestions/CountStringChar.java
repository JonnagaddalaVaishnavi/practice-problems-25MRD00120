package mits.mca.testquestions;

public class CountStringChar {
    static int countFrequency(String str){
        int count1 = 0, count2 = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == '*'){
                count1++;
            } else {
                count2++;
            }
        }
        if(count1 > count2) return 1;
        else if(count1 == count2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        String str = "***####";
        System.out.println(countFrequency(str));
    }
}
