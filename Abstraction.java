public abstract class Movement {
    public abstract void moveForward();
    public void moveReverse() {
        System.out.println("It moves reverse");
    }
}
class Vehicle extends Movement {
    public void moveForward() {
        System.out.println("It moves forward");
    }
    public static void main(String args[]) {
	Vehicle vehicle = new Vehicle();
	vehicle.moveForward();
	vehicle.moveReverse();
    }
}
