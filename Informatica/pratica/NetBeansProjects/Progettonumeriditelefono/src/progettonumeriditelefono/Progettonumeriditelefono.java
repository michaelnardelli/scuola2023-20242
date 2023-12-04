/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progettonumeriditelefono;

/**
 *
 * @author Michael
 */
public class Progettonumeriditelefono {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Numero[] Numeri = new Numero[10];
        for (int i = 0; i < 10; i++) {
            Numeri[i].Generatore();
        }
        for (int i=0;i<=Numeri.length; i++) {
            System.out.println(Numeri[i].toString());
        }
        
    
    }
    
}
