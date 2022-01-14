package com.projects;

import com.projects.logic.ApplicationLogic;
import com.projects.ui.TextInterface;
import com.projects.ui.UserInterface;

public class FirstPackages {
    public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
