package views;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.FlowLayout;


public class MainFrame extends JFrame {
  JPanel mainPanel;
  ImageIcon imageIcon;

  JButton goButton;

  public MainFrame() {

    setComponents();
    setMainPanel();
    setFrame();
  }

  

  private void setComponents() {
    imageIcon = new ImageIcon("src/static/images/catto.jpg");

    goButton = new JButton(imageIcon);

    goButton.setBounds(10, 10, 100, 30);
  }

  private void setMainPanel() {
    this.mainPanel = new JPanel();

    this.mainPanel.setLayout(null);
    this.mainPanel.setBounds(10, 10, 200, 200);

    mainPanel.add(this.goButton);
    this.add(this.mainPanel);
  }

  private void setFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(400, 300);
    this.setTitle("TEMPLATE");
    this.setVisible(true);

    // layout for window
    this.setLayout(null);
  }
}