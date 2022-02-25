import java.awt.*;
import javax.swing.*;

public class SierpinskiFrame extends JFrame {
    private SierpinskiPanel panel;

    SierpinskiFrame() {
        panel = new SierpinskiPanel();
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);

        this.add(panel);

        this.pack();
        this.setLocationRelativeTo(null);
    }

    SierpinskiFrame(int size) {
        panel = new SierpinskiPanel(size);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600,500);

        this.add(panel);

        this.pack();
        this.setLocationRelativeTo(null);
    }

    public void view() {
        this.setVisible(true);
    }

}
