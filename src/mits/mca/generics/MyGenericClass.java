package mits.mca.generics;

class  MyArrayList<T>{
    Object[] arr = new Object[20];
    int index = 0;
    int size = 0;

    void add(int value){
        arr[index++] = value;
        size++;
    }

    T get(int index){
        return (T) arr[index];
    }

    public Object[] getArr() {
        return arr;
    }

    public void setArr(Object[] arr) {
        this.arr = arr;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    /*
    public MyArrayList(Object[] arr, int index) {
        this.arr = arr;
        this.index = index;
    }

     */
}

public class MyGenericClass {
    public static void main(String[] args) {
        MyArrayList<Integer> al = new MyArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        for(int i=0 ; i < al.size ; i++ ){
            System.out.println(al.get(i));
        }
    }
}
