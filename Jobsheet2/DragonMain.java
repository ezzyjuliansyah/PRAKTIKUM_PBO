public class DragonMain {
    public static void main(String[] args) {

        Dragon dragon1 = new Dragon();
        System.out.println("Status awal dragon1:");
        dragon1.printStatus();

        dragon1.move(5);
        dragon1.changeDirection(1);
        dragon1.move(3);
        System.out.println("Status dragon1 setelah bergerak:");
        dragon1.printStatus();

        Dragon dragon2 = new Dragon();

        System.out.println("Status awal dragon2:");
        dragon2.printStatus();

        dragon2.move(4);
        dragon2.changeDirection(3);
        dragon2.move(2);
        System.out.println("Status dragon2 setelah bergerak:");
        dragon2.printStatus();
    }
}