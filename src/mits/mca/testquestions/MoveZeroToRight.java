package mits.mca.testquestions;

public class MoveZeroToRight {

    static int[] moveZerosToRight(int[] arr){

        int i=0, j=0;
        while(i<arr.length){
            if(arr[i] == 0){
                i++;
            } else {
                arr[j++]=arr[i++];
            }
        }
        while(j<arr.length){
            arr[j++]=0;
        }
        return arr;
    }

    public static void main(String[] args) {
            int[] arr = {4,5,0,1,9,0,5,0};
            int[] res = moveZerosToRight(arr);
            for(int ans: res){
                System.out.print(ans+",");
            }
    }
}
