package com.projects;

public class Main {

    public static void main(String[] args) {
	    // write your code here
//        Abbreviations abbreviations = new Abbreviations();
//        abbreviations.addAbbreviation("e.g.", "for example");
//        abbreviations.addAbbreviation("etc.", "and so on");
//        abbreviations.addAbbreviation("i.e.", "more precisely");
//
//        String text = "e.g. i.e. etc. lol";
//
//        for (String part: text.split(" ")) {
//            if(abbreviations.hasAbbreviation(part)) {
//                part = abbreviations.findExplanationFor(part);
//            }
//
//            System.out.print(part);
//            System.out.print(" ");
//        }
//
//        System.out.println();
        IOU mattsIOU = new IOU();
        mattsIOU.setSum("Arthur", 51.5);
        mattsIOU.setSum("Michael", 30);

        System.out.println(mattsIOU.howMuchDoIOweTo("Arthur"));
        System.out.println(mattsIOU.howMuchDoIOweTo("Michael"));
    }
}
