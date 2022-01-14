package com.projects.flightcontrol;
import com.projects.flightcontrol.logic.FlightControl;
import com.projects.flightcontrol.ui.TextUI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FlightControl testFC = new FlightControl();
        Scanner sc = new Scanner(System.in);

        TextUI ui = new TextUI(testFC, sc);

        ui.start();
    }
}
