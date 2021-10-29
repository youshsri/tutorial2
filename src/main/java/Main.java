import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Point p = new Point(200, 200);
        Color c = new Color(0x992266);

        Circle circ = new Circle(p, c, 10);
        Rect rect = new Rect(p, c, 20,20);

        Drawing d1 = new Drawing(circ);
        Drawing d2 = new Drawing(rect);
    }
}
