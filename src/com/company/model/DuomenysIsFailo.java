package com.company.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DuomenysIsFailo {
    private static DuomenysIsFailo firstInstance = null;

    private static ArrayList<Animal> sarasas;



    public void readData() {
        FileReader reader = null;
        try {
            reader = new FileReader("duomenys.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Scanner sc = new Scanner(reader);
        sarasas=new ArrayList<>();
        while (sc.hasNext()) {
            String type = sc.next();
            String rusis = sc.next();
            String vardas = sc.next();
            float svoris = sc.nextFloat();
            float ugis = sc.nextFloat();
            String judejimas = sc.next();
            sarasas.add(buildAnimal(type, rusis, vardas, svoris, ugis, judejimas));



        }
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        sc.close();

    }

    public Animal buildAnimal(String type, String rusis, String vardas, float svoris, float ugis, String judejimas) {
        Animal result = null;
        switch (type) {
            case "dog":
                result = new dog(type, rusis, vardas, svoris, ugis, judejimas);
                break;
            case "cat":
                result = new cat(type, rusis, vardas, svoris, ugis, judejimas);
                break;
            case "eagle":
                result = new eagle(type, rusis, vardas, svoris, ugis, judejimas);
                break;
        }
        return result;
    }
    public static void gyvunas(int i){
  //      for (int i = 0; i < sarasas.size(); i++) {

            System.out.print(sarasas.get(i).getName()+" ");
            System.out.print(sarasas.get(i).getRusis()+" ");
            System.out.print(sarasas.get(i).getVardas()+" ");
            System.out.print(sarasas.get(i).getSvoris()+" ");
            System.out.print(sarasas.get(i).getUgis()+" ");
            System.out.println(sarasas.get(i).getJudejimas());
    }
    public static void gyvunas(String keiciam, int j){
        //      for (int i = 0; i < sarasas.size(); i++) {

        System.out.print(sarasas.get(j).getName()+" ");
        System.out.print(sarasas.get(j).getRusis()+" ");
        System.out.print(sarasas.get(j).getVardas()+" ");
        System.out.print(sarasas.get(j).getSvoris()+" ");
        System.out.print(sarasas.get(j).getUgis()+" ");
        System.out.println(keiciam);
    }



    private DuomenysIsFailo() {
        readData();
    }

    public static DuomenysIsFailo getInstance() {
        if (firstInstance == null) {

                firstInstance = new DuomenysIsFailo();

        }
        return firstInstance;
    }
}