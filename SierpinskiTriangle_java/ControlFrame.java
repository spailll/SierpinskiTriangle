import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ControlFrame extends JFrame implements ActionListener {
    private JPanel panel;
    private JLabel label1;
    private JButton button1;
    private JButton button2;
    private JTextField textField1;

    ControlFrame() {
        panel = new JPanel();
        
        label1 = new JLabel("Option Select");
        button1 = new JButton("Just Make A Triangle");
        button2 = new JButton("Enter Number of Data Points");
        textField1 = new JTextField(10);

        button1.addActionListener(this);
        button2.addActionListener(this);

        panel.add(button1);
        panel.add(textField1);
        panel.add(button2);
        panel.setPreferredSize(new Dimension(500, 100));

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,100);
        this.add(panel, BorderLayout.CENTER);
        this.setLocationRelativeTo(null);
    }

    public void view() {
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == button1) {
            SierpinskiFrame t = new SierpinskiFrame();
            t.view();
        }   else if (e.getSource() == button2) {
            SierpinskiFrame t = new SierpinskiFrame(Integer.parseInt(textField1.getText()));
            t.view();
        }   
        this.setVisible(false);
    }
}
