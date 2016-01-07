package ca._4976.stronghold.gui.graphics;

import javax.swing.*;

import java.awt.*;

import static ca._4976.stronghold.gui.Main.APP_NAME;

public class Graphics extends JFrame {

    public Graphics() {

        setUndecorated(true);
        setTitle(APP_NAME);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Content content = new Content();
        add(content);
        pack();
        setLocation(0,0);
        setVisible(true);
    }

    public class Content extends JPanel {

        public Content() {

            Rectangle windowBounds = GraphicsEnvironment.getLocalGraphicsEnvironment().getMaximumWindowBounds();
            Dimension windowSize = new Dimension(windowBounds.width, windowBounds.height - 200);

            setPreferredSize(windowSize);
            setMaximumSize(windowSize);
            setMinimumSize(windowSize);

            pack();
        }
    }
}
