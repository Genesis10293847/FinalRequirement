import javax.swing.*;
import java.awt.*;

public class TestPlayWindow {

    public TestPlayWindow(){
        JFrame frame = new JFrame("Bato-Bato Pick");
        frame.setSize(768, 630);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(6,8,6,8));
        Image backgroundImg = new ImageIcon(getClass().getResource("Background.gif")).getImage();


        JPanel backgroundPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                g.drawImage(backgroundImg, 0,0,getWidth(),getHeight(),this);
            }
        };

        backgroundPanel.setLayout(new BorderLayout());
        frame.add(backgroundPanel, BorderLayout.CENTER);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new TestPlayWindow();
    }
}
