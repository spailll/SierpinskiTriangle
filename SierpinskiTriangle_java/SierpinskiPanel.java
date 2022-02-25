import java.awt.*;
import javax.swing.*;

public class SierpinskiPanel extends JPanel{
    private int numPoints = 200000;

    private double[] startingX = {0.0, 5.0, 10.0};
    private double[] startingY = {0.0, 8.66, 0.0};

    private double randomX = Math.random() * 10;
    private double randomY = Math.random() * 10;


    SierpinskiPanel() {                                                  //panel object
        this.setPreferredSize(new Dimension(600,500));
    }

    SierpinskiPanel(int size) {                                           //panel object
        this.setPreferredSize(new Dimension(600,500));
        if (size > 3) { numPoints = size; }
    }

    public void paint(Graphics g) {                                      //paint method (called automatically from extention of JPanel)
        Graphics2D g2D = (Graphics2D) g;

        g2D.setPaint(Color.blue);
        g2D.fillRect(0, 0, 600, 500);
        g2D.setPaint(Color.red);

        double[][] points = new double[2][numPoints];
        int rand;

        for (int j = 0; j < numPoints; j++) {
            if (j < 3) {
                
                points[0][j] = startingX[j];
                points[1][j] = (10.0 - startingY[j]);

            }   else {

                rand = (int) (Math.random() * 3.0);
                randomX = (randomX + startingX[rand]) / 2.0;
                randomY = (randomY + (10.0 - startingY[rand])) / 2.0;
                points[0][j] = randomX;
                points[1][j] = randomY;

            }
            g2D.drawOval((int) (points[0][j] * 50.0 + 50), (int) (points[1][j] * 50.0 - 40.0), 1, 1);
            g2D.fillOval((int) (points[0][j] * 50.0 + 50), (int) (points[1][j] * 50.0 - 40.0), 1, 1);
        } 
    }
}
