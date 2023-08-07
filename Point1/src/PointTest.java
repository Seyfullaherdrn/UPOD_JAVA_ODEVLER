import java.util.Scanner;

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double calculateDistanceToCenter() {
        return Math.sqrt(x * x + y * y);
    }

    public double calculateDistanceToPoint(Point otherPoint) {
        double dx = x - otherPoint.getX();
        double dy = y - otherPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point clone() {
        return new Point(x, y);
    }

    public void move(char direction, double amount) {
        if (direction == 'x') {
            x += amount;
        } else if (direction == 'y') {
            y += amount;
        }
    }
}

public class PointTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. noktanın x koordinatını girin: ");
        double x1 = scanner.nextDouble();
        System.out.println("1. noktanın y koordinatını girin: ");
        double y1 = scanner.nextDouble();
        Point p1 = new Point(x1, y1);

        System.out.println("2. noktanın x koordinatını girin: ");
        double x2 = scanner.nextDouble();
        System.out.println("2. noktanın y koordinatını girin: ");
        double y2 = scanner.nextDouble();
        Point p2 = new Point(x2, y2);

        System.out.println("p1'in merkeze uzaklığı: " + p1.calculateDistanceToCenter());
        System.out.println("p1'den p2'ye uzaklık: " + p1.calculateDistanceToPoint(p2));

        Point p3 = p1.clone();

        System.out.println("X ekseni üzerinde kaç birim hareket etsin?");
        double xMovement = scanner.nextDouble();
        p3.move('x', xMovement);

        System.out.println("Y ekseni üzerinde kaç birim hareket etsin?");
        double yMovement = scanner.nextDouble();
        p3.move('y', yMovement);

        scanner.close();

        System.out.println("p3'ün yeni koordinatları: (" + p3.getX() + ", " + p3.getY() + ")");
    }
}