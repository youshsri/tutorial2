import java.awt.*;

public class Circle extends Shape{
    private int radius;

    public Circle(Point pos, Color col, int rad) {
        super(pos, col);
        this.radius = rad;
        this.pos = pos;
        this.col = col;
    }

    public void draw(Graphics g) {
        g.setColor(col);
        g.fillOval(pos.x, pos.y, radius, radius);
    }
    
}
