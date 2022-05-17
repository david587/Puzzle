package controllers;

import javax.swing.JButton;
import java.awt.event.ActionEvent;
import models.MainModel;
import views.MainFrame;

public class MainController {
  MainFrame mainFrame;
  MainModel mainModel;

  JButton[] buttons;
  
  public MainController() {
    this.mainFrame = new MainFrame();
    this.mainModel = new MainModel();
    
    buttons = mainFrame.buttons;

    this.setEvents();
  }

  private void actionHandler(ActionEvent action) {
    JButton clickedButton = (JButton) action.getSource();

    int x = clickedButton.getLocation().x;
    int y = clickedButton.getLocation().y;

    System.out.println(x + " " + y);
  }

  private void setEvents() {
    for (int i = 0; i < buttons.length; i++) {
      buttons[i].addActionListener(action -> actionHandler(action));
    }
  }
}