package com.projects.logic;

import com.projects.ui.UserInterface;

public class ApplicationLogic {
    private  UserInterface ui;
    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }
    public void execute(int times) {
        System.out.println("Application logic is working");
        ui.update();
    }
}
