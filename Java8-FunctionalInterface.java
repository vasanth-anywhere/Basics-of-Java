@FunctionalInterface
public interface Interface {
    public void display();
}

public class Main implements Interface{

    public static void main(String[] args) {
        Interface interf = new Main();
        interf.display();

        Interface interf1 = () -> {
            System.out.println("Display method using Lambda expression");
        };
        interf1.display();
    }
    public void display() {
        System.out.println("Display method using Normal expression");
    }
}
