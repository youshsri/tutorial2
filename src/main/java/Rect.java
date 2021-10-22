import java.awt.*;

public class Rect {
    private int width;
    private int height;
    private Point pos;
    private Color col;

    public Rect(Point initPos, Color col, int width, int height) {
        this.pos = initPos;
        this.col = col;
        this.width = width;
        this.height = height;
    }

    public void draw(Graphics g) {
        g.setColor(col);
        g.fillRect(pos.x, pos.y, width, height);
    }
}
