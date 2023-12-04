package progettopersona;

 public class Persona {
    private String codiceFiscale;
    private String nome;
    private String cognome;
    
    public void setCodiceFiscale(String codiceFiscale) {
        this.codiceFiscale = codiceFiscale;
    }
    
    public String getCodiceFiscale() {
        return codiceFiscale;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    public String getCognome() {
        return cognome;
    }

    public Persona(String codiceFiscale, String nome, String cognome) {
        this.codiceFiscale = codiceFiscale;
        this.nome = nome;
        this.cognome = cognome;
    }
    
    @Override
    public String toString() {
        return "Persona [codiceFiscale=" + codiceFiscale + ", nome=" + nome + ", cognome=" + cognome + "]";
    }
}


