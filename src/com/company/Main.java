package com.company;

import com.company.controller.controleris;
import com.company.model.Animal;
import com.company.model.DuomenysIsFailo;
import com.company.view.view;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        view obj=new view();
        obj.pasirinkti();
        controleris obj1=new controleris();
        obj1.spausdinam();
        obj.juda();
        obj1.Keiciam();
//        Scanner sc = new Scanner(System.in);
//        DuomenysIsFailo.getInstance();
//        int i=sc.nextInt()-1;
//        DuomenysIsFailo.gyvunas(i);

    }
}

