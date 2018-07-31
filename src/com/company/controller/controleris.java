package com.company.controller;

import com.company.model.DuomenysIsFailo;

import java.util.Scanner;

public class controleris {
public int j;
   public void spausdinam() {
       Scanner sc = new Scanner(System.in);
       DuomenysIsFailo.getInstance();
       int i = sc.nextInt() - 1;
       j=i;
       DuomenysIsFailo.gyvunas(i);
       //  Animal Dog= new dog(DuomenysIsFailo.sarasas.(type, rusis, vardas, svoris, ugis, judejimas)));
       }
       public void Keiciam(){

       Scanner sc=new Scanner(System.in);
       String keiciam=sc.next();

           DuomenysIsFailo.gyvunas(keiciam,j);
       }

//    public static void animalchoise (){
//        for (int i = 0; i < gyvunas.getSarasas().get.size(); i++) {
//            System.out.print(gyvunas.get(i).getName()+" ");
//            System.out.print(gyvunas.get(i).getRusis()+" ");
//            System.out.print(gyvunas.get(i).getVardas()+" ");
//            System.out.print(gyvunas.get(i).getSvoris()+" ");
//            System.out.print(gyvunas.get(i).getUgis()+" ");
//            System.out.println(gyvunas.get(i).getJudejimas());}
//    }


}
