/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettonumeriditelefono;

/**
 *
 * @author Michael
 */

public class Numero {
    private int[] Numeri = new int[10];

  
    

    public void Generatore() {
        for (int i = 3; i < 10; i++) {
            Numeri[i] = (int) (Math.random() * 10); // Generate a random digit
        }
    }

    @Override
            public String toString() {
    String result = "";
    for (int i = 0; i < 10; i++) {
        result += Numeri[i];
        if (i != 9) {
            result += ", ";
        }
    }
    return result;
}
            
    
}
