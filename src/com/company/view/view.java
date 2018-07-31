package com.company.view;

import java.util.Scanner;

public class view {
    public void pasirinkti() {
        System.out.println("pasirinkite gyvuno nr.");
        System.out.println("suo -Nr.1   kate-Nr.2   erelis-Nr.3");
    }

    public void juda() {
        System.out.println("Ar norite pakeisti judejima?");
        System.out.println("Y/N");
        Scanner sc = new Scanner(System.in);
        String at = sc.nextLine();
        if (at.equals("n")) {
            System.exit(0);
        }
        System.out.println("Kokio judejimo norit?");
        System.out.println("runs/walks/flies");
}
}