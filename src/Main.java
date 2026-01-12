import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.ImageIcon;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tabbed Pane Example");
        JTabbedPane tabbedPane = new JTabbedPane();

        // Create the first panel and add components
        JPanel panel1 = new JPanel();
        panel1.add(new JLabel());

        // Add the tabbed pane to the frame
        frame.add(tabbedPane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1500, 1000);

        ImageIcon board = new ImageIcon("board.png");
        JLabel imageLabel = new JLabel(board);

        imageLabel.setBounds(0, 0,
                board.getIconWidth(),
                board.getIconHeight());

        panel1.add(imageLabel);
        // Add the JLabel with the image to a tab
        tabbedPane.addTab("Image Tab", imageLabel);
        frame.setVisible(true);
    }

}