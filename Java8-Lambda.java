public interface Interface {
    public void display();
}

public class Main {

    public static void main(String[] args) {
        Interface interf = () -> {
            System.out.println("This is the display method");
        };
        interf.display();
    }
}