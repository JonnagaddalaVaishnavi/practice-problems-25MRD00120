package mits.mca.exceptions;

public class Program1 {
    public static void main(String[] args) {
        /*
        int a = 10;
        int b = 0;
        try{
            int c = a/b;
            System.out.println(c);
        } catch (ArithmeticException ae){
            System.out.println(ae);
        }


        int age = 10;
        try {
            isEligible(age);
        } catch (Exception e) {
            System.out.println(e);
        }

         */
        System.out.println(dummy());
    }

    static boolean isEligible(int age) throws Exception{
        if(age >= 18){
            System.out.println("Eligible");
            return true;
        } else {
            throw new Exception("You are not eligible");
        }
    }

    static int dummy(){
        try{
            System.out.println("Try block");
            return 10;
        }
        finally {
            System.out.println("Finally block");
            return 20;
        }
    }
}
