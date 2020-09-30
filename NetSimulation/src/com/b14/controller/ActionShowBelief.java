package com.b14.controller;

import com.b14.view.GraphPanel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class ActionShowBelief extends AbstractAction implements PropertyChangeListener {

    private GraphPanel panel;

    public ActionShowBelief(GraphPanel panel) {
        super("Show belief");
        this.panel = panel;
        setState();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        panel.setDrawBelief(true);
    }

    private void setState() {
        System.out.println("Setting state");
        setEnabled(!panel.isDrawingBelief());
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        setState();
    }
}
