package mits.mca.generics;

class Box<T>{
    T box;

    Box(T box){
        this.box = box;
    }

    T get(){
        return this.box;
    }
}
class Prod<K,V>{
    K name;
    V price;
    Prod(K name,V price){
        this.name = name;
        this.price = price;
    }

    public K getName() {
        return name;
    }

    public void setName(K name) {
        this.name = name;
    }

    public V getPrice() {
        return price;
    }

    public void setPrice(V price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name +" costs "+ price;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> b = new Box<>(10);
        Box<String> bb = new Box<>("Vaishnavi");
        System.out.println(b.get());
        System.out.println(bb.get());

        Prod<String, Integer> p = new Prod<>("Apple",250);
        System.out.println(p.getPrice());
        System.out.println(p.getName());
        System.out.println(p.toString());

    }
}
