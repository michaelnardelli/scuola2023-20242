/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjcaramella;

/**
 *
 * @author Michael
 */
public class Bustone {
     private Bustina[] bustine = new Bustina[7];
  

   
    public Bustone() {
        for (int i = 0; i < 7; i++) {
            bustine[i] = new Bustina();
        }
        
    }

   
     public void apriBustina(int numeroBustina) {
        if (numeroBustina >= 1 && numeroBustina <= 7) {
          String caramella = bustine[numeroBustina - 1].getCaramella();
            System.out.println(+ numeroBustina +" tipolocaramella:  " + caramella + ".");
        } else {
            System.out.println("Numero di bustina non valido.");
        }
    }
  
    public static void apri() {
        System.out.println("Bustone aperto!");
    }
}
