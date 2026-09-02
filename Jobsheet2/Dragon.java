public class Dragon {
    int x;
    int y;
    int direction;

    public Dragon() {
        x = 0;
        y = 0;
        direction = 1;
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid! Direction harus 1 (atas), 2 (kanan), 3 (bawah), atau 4 (kiri).");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1:
                y += steps;
                break;
            case 2:
                x += steps;
                break;
            case 3:
                y -= steps;
                break;
            case 4:
                x -= steps;
                break;
            default:
                System.out.println("Direction belum valid, dragon tidak bergerak.");
        }
    }

    public void printStatus() {
        System.out.println("Posisi: (" + x + ", " + y + ")");
        System.out.println("Direction: " + direction);
        System.out.println("========================");
    }
}