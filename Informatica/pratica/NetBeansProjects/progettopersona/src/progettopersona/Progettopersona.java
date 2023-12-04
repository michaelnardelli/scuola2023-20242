/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progettopersona;

/**
 *
 * @author Michael
 */
public class Progettopersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona persona = new Persona("Mario","Rossi","RSSMRA80A01H501P");

        System.out.println(persona.toString());
        Studente studente = new Studente("Giulia","Verdi","VRDGPP91B18L736N","2021001","Università di Bologna");
        System.out.println(studente);
        
        // Creazione di un oggetto Docente
        Docente docente = new Docente("Luca",500.0,"MRORSL70H05H501D","moro ","Informatica");
      
        System.out.println(docente);
    
}}
