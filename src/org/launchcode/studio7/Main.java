package org.launchcode.studio7;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        CD one = new CD("One", 23, "CD", 20);
        DVD theGoonies = new DVD("The Goonies", 126, "DVD", 125);

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(one.pauseMedia("Day Tripper"));
        System.out.println(theGoonies.resumeMedia("The Goonies - Chapter 10"));
    }
}
