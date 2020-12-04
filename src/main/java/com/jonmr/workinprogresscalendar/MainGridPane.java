package com.jonmr.workinprogresscalendar;

import com.calendarfx.view.page.YearPage;

import javafx.scene.Node;
import javafx.scene.layout.GridPane;

public class MainGridPane extends GridPane {
    public MainGridPane(Node menuBar, YearPage yearPage) {
        int row = 0;
        add(menuBar, 0, row++);
        add(yearPage.getToolBarControls(), 0, row++);
        add(yearPage, 0, row);
        getStyleClass().addAll("grid", "pane");
        getStylesheets().add("custom.css");
    }
}
