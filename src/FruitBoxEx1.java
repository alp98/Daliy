import javax.swing.*;
import java.applet.Applet;
import java.util.ArrayList;
public class FruitBoxEx1 {
    public static void main(String[] args) {
        Box<Fruit> fruitBox= new Box<Fruit>();
        Box<Apple> appleBox= new Box<Apple>();
        Box<Toy> toybox= new Box<Toy>();
        Box<Grape> grapeBox =new Box<Grape>();
        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());

        appleBox.add(new Apple());
        appleBox.add(new Apple());

        toybox.add(new Toy());
        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toybox);
    }
}
    class Fruit{public String toString(){return "Fruit";} }
    class Apple extends Fruit {public String toString(){return "Apple";}}
    class Grape extends Fruit {public String toString() {return "Grape";}}
    class Toy {public  String toString(){return "Toy";}}

class Box<T> {
    ArrayList<T> list= new ArrayList<T>();
    void add(T item) {list.add(item);}
    T get(int i){return list.get(i);}
    int size(){return list.size();}
    public String toString(){return list.toString();}
}
