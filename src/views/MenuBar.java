package views;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuBar extends JMenuBar {

  JMenu fileMenu;
    public JMenuItem exitMenuItem;
  JMenu toolsMenu;
    public JMenuItem shuffleMenuItem;
  JMenu helpMenu;

  public MenuBar() {
    this.fileMenu = new JMenu("File");
      this.exitMenuItem = new JMenuItem("Exit");
      
    this.toolsMenu = new JMenu("Tools");
      this.shuffleMenuItem = new JMenuItem("Mix");

    this.fileMenu.add(exitMenuItem);
    this.toolsMenu.add(shuffleMenuItem);

    this.add(fileMenu);
    this.add(toolsMenu);
      
  }
    
}
