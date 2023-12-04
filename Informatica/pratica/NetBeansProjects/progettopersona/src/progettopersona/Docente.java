/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progettopersona;

/**
 *
 * @author Michael
 */
public class Docente extends Persona {
    private String materia;
    private double salario;

    public Docente(String materia, double salario, String codiceFiscale, String nome, String cognome) {
        super(codiceFiscale, nome, cognome);
        this.materia = materia;
        this.salario = salario;
    }
    
    
    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    public String getMateria() {
        return materia;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }
    
    @Override
    public String toString() {
        return "Docente [codiceFiscale=" + getCodiceFiscale() + ", nome=" + getNome() + ", cognome=" + getCognome()
            + ", materia=" + materia + ", salario=" + salario + "]";
    }
}

