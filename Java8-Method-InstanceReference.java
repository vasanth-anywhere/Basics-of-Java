@FunctionalInterface
public interface Interface {
    public void display();
}

public class Main{

    public static void main(String[] args) {

        Main main = new Main();

        Interface interf1 = Main::displayStatic;
        interf1.display();

        Interface interf2 = main::displayInstance;
        interf2.display();
    }
    public static void displayStatic() {
        System.out.println("Display Original Static method");
    }
    public void displayInstance() {
        System.out.println("Display Original Instance method");
    }
}