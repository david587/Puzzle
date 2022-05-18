package views;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Point;

public class MainFrame extends JFrame {
  JPanel mainPanel;
  ImageIcon imageIcon;

  JButton goButton;

  public JButton[] buttons;
  ImageIcon[] images;

  // scaleable puzzle

  public final int IMAGE_WIDTH = 50;
  public final int IMAGE_HEIGHT = 50;

  String[] imageNames = {
    "1_1.png", "1_2.png", "1_3.png", "1_4.png",
    "2_1.png", "2_2.png", "2_3.png", "2_4.png",
    "3_1.png", "3_2.png", "3_3.png", "3_4.png",
    "4_1.png", "4_2.png", "4_3.png"
  };

  // let x, y coordinates come from array of Points
  //replace setBounds with setLocation(Point)

  Point[] baseCoordinates = {
    new Point(0, 0),
    new Point(IMAGE_WIDTH, 0),
    new Point(IMAGE_WIDTH * 2, 0),
    new Point(IMAGE_WIDTH * 3, 0),

    new Point(0, 0),
    new Point(IMAGE_WIDTH, IMAGE_HEIGHT),
    new Point(IMAGE_WIDTH * 2, IMAGE_HEIGHT),
    new Point(IMAGE_WIDTH * 3, IMAGE_HEIGHT),

    new Point(0, IMAGE_HEIGHT * 2),
    new Point(IMAGE_WIDTH, IMAGE_HEIGHT * 2),
    new Point(IMAGE_WIDTH * 2, IMAGE_HEIGHT * 2),
    new Point(IMAGE_WIDTH * 3, IMAGE_HEIGHT * 2),

    new Point(0, IMAGE_HEIGHT * 3),
    new Point(IMAGE_WIDTH, IMAGE_HEIGHT * 3),
    new Point(IMAGE_WIDTH * 2, IMAGE_HEIGHT * 3),
  };

  public MainFrame() {

    setButtons();
    setBasePositions();
    setMainPanel();
    setFrame();
  }

  private void setButtons() {
    images = new ImageIcon[15];
    for (int i = 0; i< images.length; i++) {
      images[i] = new ImageIcon("src/static/images/" + imageNames[i]);
    }
    buttons = new JButton[15];

    for (int i = 0; i < buttons.length; i++) {
      buttons[i] = new JButton(images[i]);

    }

  }


  private void setBasePositions() {
    buttons[0].setBounds(0, 0, IMAGE_WIDTH, IMAGE_HEIGHT); // 1_1
    buttons[1].setBounds(250, 0, IMAGE_WIDTH, IMAGE_HEIGHT); // 1_2
    buttons[2].setBounds(500, 0, IMAGE_WIDTH, IMAGE_HEIGHT); // 1_3
    buttons[3].setBounds(750, 0, IMAGE_WIDTH, IMAGE_HEIGHT); // 1_4

    buttons[4].setBounds(0, 250, IMAGE_WIDTH, IMAGE_HEIGHT); // 2_1
    buttons[5].setBounds(250, 250, IMAGE_WIDTH, IMAGE_HEIGHT); // 2_2
    buttons[6].setBounds(500, 250, IMAGE_WIDTH, IMAGE_HEIGHT); // 2_3
    buttons[7].setBounds(750, 250, IMAGE_WIDTH, IMAGE_HEIGHT); // 2_4

    buttons[8].setBounds(0, 500, IMAGE_WIDTH, IMAGE_HEIGHT); // 3_1
    buttons[9].setBounds(250, 500, IMAGE_WIDTH, IMAGE_HEIGHT); // 3_2
    buttons[10].setBounds(500, 500, IMAGE_WIDTH, IMAGE_HEIGHT); // 3_3
    buttons[11].setBounds(750, 500, IMAGE_WIDTH, IMAGE_HEIGHT); // 3_4

    buttons[12].setBounds(0, 750, IMAGE_WIDTH, IMAGE_HEIGHT); // 4_1
    buttons[13].setBounds(250, 750, IMAGE_WIDTH, IMAGE_HEIGHT); // 4_2
    buttons[14].setBounds(500, 750, IMAGE_WIDTH, IMAGE_HEIGHT); // 4_3

  }

  private void setMainPanel() {
    this.mainPanel = new JPanel();

    this.mainPanel.setLayout(null);
    this.mainPanel.setBounds(10, 10, 1020, 1020);
    for (int i = 0; i < buttons.length; i++) {
      this.mainPanel.add(buttons[i]);
    }
    this.add(this.mainPanel);
  }

  private void setFrame() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(1100, 1200);
    this.setTitle("TEMPLATE");
    this.setVisible(true);

    // layout for window
    this.setLayout(null);
  }
}