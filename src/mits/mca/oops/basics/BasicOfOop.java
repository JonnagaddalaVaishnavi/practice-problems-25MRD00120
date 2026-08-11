package mits.mca.oops.basics;

class Students{
    int rollNo;
    String name;

    Students(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }

    Students(Students s){
        this.rollNo= s.rollNo;;
        this.name=s.name;
    }
    public void dispaly(){
        System.out.println(rollNo);
        System.out.println(name);
    }

}
public class BasicOfOop {
    public static void main(String[] args) {
        Students stu = new Students(120,"Vaishnavi");
        Students s1 = new Students(stu);
        s1.dispaly();
    }
}
