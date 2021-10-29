import java.awt.*;

public class Rect extends Shape {
    protected int width;
    protected int height;

    Rect(Point pos, Color col, int width, int height) {
        super(pos, col);
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.setColor(col);
        g.fillRect(pos.x, pos.y, width, height);
    }
}
