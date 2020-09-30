package com.b14.controller;

import com.b14.view.GraphPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ActionToggleDrawIDs extends AbstractAction {

    private GraphPanel panel;

    public ActionToggleDrawIDs(GraphPanel panel) {
        super("Toggle node IDs");
        this.panel = panel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.toggleDrawIDs();
    }
}
