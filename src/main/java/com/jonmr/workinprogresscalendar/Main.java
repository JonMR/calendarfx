package com.jonmr.workinprogresscalendar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        WorkInProgressYearPage yearPage = new WorkInProgressYearPage();

        MenuBar menuBar = new MenuBar();
        final String os = System.getProperty("os.name");
        if (os != null && os.startsWith("Mac")) {
            menuBar.useSystemMenuBarProperty().set(true);
            System.err.println("mac!");
        }
        Menu menu = new Menu("java");
        MenuItem item = new MenuItem("Test");

        menu.getItems().add(item);
        menuBar.getMenus().add(menu);

        MainGridPane gridPane = new MainGridPane(menuBar, yearPage);

        primaryStage.setTitle("Calendar");
        primaryStage.setScene(new Scene(gridPane));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
