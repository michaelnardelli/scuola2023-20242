/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettopersona;

/**
 *
 * @author Michael
 */
 public class Studente extends Persona {
    private String matricola;
    private String universita;

    public Studente(String matricola, String universita, String codiceFiscale, String nome, String cognome) {
        super(codiceFiscale, nome, cognome);
        this.matricola = matricola;
        this.universita = universita;
    }
    
    public void setMatricola(String matricola) {
        this.matricola = matricola;
    }
    
    public String getMatricola() {
        return matricola;
    }
    
    public void setUniversita(String universita) {
        this.universita = universita;
    }
    
    public String getUniversita() {
        return universita;
    }
    
    @Override
    public String toString() {
        return "Studente [codiceFiscale=" + getCodiceFiscale() + ", nome=" + getNome() + ", cognome=" + getCognome()
            + ", matricola=" + matricola + ", universita=" + universita + "]";
    }
}
