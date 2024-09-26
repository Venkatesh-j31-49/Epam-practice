package classes.E1;

import java.util.Scanner;
import javax.sound.sampled.Line;

public class e1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        Line line1 = new Line(k1,b1);
        Line line2 = new Line(k2,b2);

        System.out.println("result is " + line1.intersection(line2));

        
    }
    private int k;
    private int b;

    public Line(int k, int b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line other) {
        if (this.k == other.k) {
            // If the y-intercepts (b) are also the same, the lines coincide
            if (this.b == other.b) {
                return null;  // Lines coincide
            }
            return null;  // Lines are parallel and do not intersect
        }

        // Calculate the x-coordinate of the intersection
        int x = (other.b - this.b) / (this.k - other.k);

        // Calculate the y-coordinate using one of the line equations (y = k * x + b)
        int y = this.k * x + this.b;
        return new Point(x, y);

        //throw new UnsupportedOperationException();
    }


    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d;%d)", x, y);
}
