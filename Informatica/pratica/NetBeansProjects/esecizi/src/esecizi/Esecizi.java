/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package esecizi;

/**
 *
 * @author Michael
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Esecizi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             try {
            // Apertura del file in modalità scrittura
            FileWriter writer = new FileWriter("testo.txt");
            Scanner scanner = new Scanner(System.in);

            // Richiesta di input all'utente
            String linea = "";
            while (!linea.equals("fine")) {
                System.out.println("Scrivi una frase (o 'fine' per terminare):");
                linea = scanner.nextLine();

                // Scrittura della linea nel file
                if (!linea.equals("fine")) {
                    writer.write(linea + "\n");
                }
            }

            // Chiusura del file
            writer.close();
            scanner.close();

        } catch (IOException e) {
            System.out.println("Errore durante la scrittura del file: " + e.getMessage());
        }
}}
