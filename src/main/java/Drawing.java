import com.sun.tools.jdeps.Graph;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Drawing extends Canvas {
    private Frame f;
    private Circle c;
    private Rect r;

    public Drawing(Circle c) {

        this.c = c;

        f = new Frame("My Window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                f.dispose();
            }
        });
        setBackground(Color.WHITE);
        setSize(400, 400);
    }

    public void paint(Graphics g) {
        c.draw(g);
        r.draw(g);
    }


}
