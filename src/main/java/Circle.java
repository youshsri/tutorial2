import java.awt.*;

public class Circle {
    private int radius;
    private Point pos;
    private Color col;

    public Circle(Point initPos, Color col, int rad) {
        this.radius = rad;
        this.pos = initPos;
        this.col = col;
    }

    public void draw(Graphics g) {
        g.setColor(col);
        g.fillOval(pos.x, pos.y, radius, radius);
    }
    
}
