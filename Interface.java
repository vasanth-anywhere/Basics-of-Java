Interface Animal {
    void run();
    void sound();
    void walk();
}
class Tiger implements Animal {
    public void run() {
        System.out.println("It runs fast");
    }
    public void sound() {
        System.out.println("It roars");
    }
    public void walk() {
        System.out.println("It walks fine");
    }
    public static void main (String args[]) {
        Tiger tiger = new Tiger();
        tiger.walk();
        tiger.sound();
        tiger.run();
    }
}