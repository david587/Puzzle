package views;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Point;
import java.awt.Image;

public class MainFrame extends JFrame {
  JPanel mainPanel;
  ImageIcon imageIcon;

  JButton goButton;

  public JButton[] buttons;
  ImageIcon[] images;

  // scaleable puzzle

  public final int IMAGE_WIDTH = 100;
  public final int IMAGE_HEIGHT = 100;

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

    new Point(0, IMAGE_HEIGHT),
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
      // resize images here 
      ImageIcon imageIcon = resizeImageIcon(images[i], IMAGE_WIDTH, IMAGE_HEIGHT);

      // attach resized icon to button
      buttons[i] = new JButton(imageIcon);

      // set coordinates
      buttons[i].setLocation(baseCoordinates[i]);

      // set size 
      buttons[i].setSize(IMAGE_WIDTH, IMAGE_HEIGHT);

    }

  }

  private void setMainPanel() {
    this.mainPanel = new JPanel();

    this.mainPanel.setLayout(null);
    this.mainPanel.setBounds(
      10, 
      10, 
      IMAGE_WIDTH * 4 + 20, 
      IMAGE_HEIGHT * 4 + 50);
    for (int i = 0; i < buttons.length; i++) {
      this.mainPanel.add(buttons[i]);
    }
    this.add(this.mainPanel);
  }

  private void setFrame() {
    this.setJMenuBar(new MenuBar());
    // layout for window
    this.setLayout(null);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(IMAGE_WIDTH * 4 + 25, IMAGE_HEIGHT * 4 + 80);
    this.setTitle("PUZZLE");
    this.setVisible(true);

  }

  private ImageIcon resizeImageIcon(
    ImageIcon imageIcon, 
    int width, 
    int height) {
      // convert to Image
      Image image = imageIcon.getImage();

      // resize as Image
      Image resizedImage = image.getScaledInstance(width, height, Image.SCALE_DEFAULT);

      // convert to ImageIcon
      ImageIcon resizedImageIcon = new ImageIcon(resizedImage);

      return resizedImageIcon;
  }
}