/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prjcaramella;

import java.util.Random;

/**
 *
 * @author Michael
 */
class Bustina {
    private String[] caramellePossibili = {"Cuore", "Cola", "Anello", "Orsetto", "Coccodrillo"};
    private String caramella;

   
    public Bustina() {
        Random rand = new Random();
        int index = rand.nextInt(caramellePossibili.length);
        caramella = caramellePossibili[index];
    }

    
    public String getCaramella() {
        return caramella;
    }
}

   









   

    

