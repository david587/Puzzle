package controllers;

import views.MainFrame;
import views.MenuBar;

public class MenuController {
  MainFrame mainFrame;
  MenuBar menuBar;

    public MenuController(MainFrame mainFrame) {
        this.mainFrame = mainFrame;
        this.menuBar = (MenuBar) this.mainFrame.getJMenuBar();

        // exit

        menuBar.exitMenuItem.addActionListener(action -> exitMenuAction());
        menuBar.shuffleMenuItem.addActionListener(action -> {
            shuffleMenuAction();
        });
}

    private void exitMenuAction() {
        System.exit(0);
    }

    private void shuffleMenuAction() {
        System.out.println("Mixing");
    }
}
