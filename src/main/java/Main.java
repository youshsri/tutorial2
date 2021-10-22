import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(200, 200);
        Color c = new Color(0x992266);

        Circle circ = new Circle(p, c, 10);

        Drawing d = new Drawing(circ);
    }
}
