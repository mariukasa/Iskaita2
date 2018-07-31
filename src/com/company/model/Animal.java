package com.company.model;
import com.company.model.DuomenysIsFailo;
public class Animal{
    private String name;
    private String rusis;
    private String vardas;
    private float svoris;
    private float ugis;



    private String judejimas;


    public Animal(String type, String rusis, String vardas, float svoris, float ugis, String judejimas){
        this.name = type;
        this.rusis = rusis;
        this.vardas = vardas;
        this.svoris = svoris;
        this.ugis = ugis;
        this.judejimas=judejimas;

    }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getRusis() { return rusis; }
    public void setRusis(String rusis) { this.rusis = rusis; }

    public float getSvoris() { return svoris; }
    public void setSvoris(float svoris) { this.svoris = svoris; }

    public float getUgis() { return ugis; }
    public void setUgis(float ugis) { this.ugis = ugis; }

    public String getVardas() { return vardas; }
    public void setVardas(String vardas) { this.vardas = vardas; }

    public String getJudejimas() { return judejimas; }
    public void setJudejimas(String judejimas) { this.judejimas = judejimas; }


 //   public String toString(){
 //       StringBuilder builder = new StringBuilder("");
 //       builder.append(name+" "+rusis+" "+vardas+" "+svoris+" "+ugis);
 //       return builder.toString();
 //   }
//
  //  public void rodykAnimal(){
  //      System.out.println(toString());
  //  }

}
