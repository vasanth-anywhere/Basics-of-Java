public class Main{
        
    //All the basics concepts of Object Oriented Programming are executed here.
     public static void main(String []args){
        System.out.println("Hello World");
        
     }
}

//Inheritance - Hierarchical Inheritance
public class Animal {
    private int weight;
    private String color;
    public void walk () {}
    public void eat () {}
}
public class Dog extends Animal {
    private String type = "Domestic";
    public void bark() {}
}
public class Tiger extends Animal {
    private String type = "Wild";
    public void roar() {}
}

//Polymorphism - Method Overloading
class Maths {
    public int add(int number1, int number2) {
        return number1+number2;
    }
    public int add(int number1, int number2, int number3) {
        return (number1+number2+number3);
    }
    public void calculation() {
        Maths maths = new Maths();
        maths.add(2,3); //gives 5
        maths.add(2,4,5); //gives 11
    }
}

//Abstraction
abstract class Shape {
    abstract void draw();
}
class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
class Circle extends Shape {
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}
class DrawShape{
    public void drawShape() {
        Shape shape1 = new Rectangle();//Draws Rectangle
        shape1.draw();
        Shape shape2 = new Circle();//Draws Circle
        shape2.draw();
    }
}

//Encapsulation
class Student {
    private int id;
    private String name;
    private int age;
}

//Coupling - The degree of dependency between the components is called Coupling.  
//TIghtly Coupled
class A {
    B b = new B();
    int a = b.getBValue();
}
class B {
    C c = new C();
    int b = c.getCValue();
    public int getBValue() {
        return b;
    }
}
class C {
    int c = 10;
    public int getCValue() {
        return c;
    }
}

//Loosely Coupled 
interface Alphabets {
    void vowels();
    void consonants();
}
class English implements Alphabets {
    public void vowels() {
        System.out.println("Number of Vowels = 5");
    }
    public void consonants() {
        System.out.println("Number of Consonants = 21");
    }
}

//Cohesion - How good a class is to do a single specific work done.

//High cohesion - java.IO package 
//Low cohesion - java.util package


//Association
class MusicPlayer{
    //Some related behvaior
}
class Engine {
    //Some related behvaior
}
class Wheels {
    //Some related behvaior
}
class Car {
    MusicPlayer player = new MusicPlayer();
    Engine engine = new Engine();
    Wheels wheels = new Wheels();
}

//Aggregation - Weakly bonded Objects
class MusicPlayer {
    //Some related behavior
}
class Car {
    MusicPlayer player = new MusicPlayer();
}


//Composition - Strongly bonded Objects
class Engine {
    //Some related behavior
}
class Car {
    Engine engine = new Engine();
}


