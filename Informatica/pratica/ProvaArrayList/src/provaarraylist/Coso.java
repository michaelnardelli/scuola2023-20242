package provaarraylist;

public class Coso implements Comparable<Coso> {
    private String descrizione = "";
    private int quantita = 0;

    public Coso(String descrizione, int quantita) {
        setDescrizione(descrizione);
        setQuantita(quantita);
    }

    public Coso(String descrizione) {
        this(descrizione, 1);
    }
   
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        if (quantita >= 0)
           this.quantita = quantita;
        else System.out.println("Eccezione!");
    }

    @Override
    public String toString() {
        if (quantita == 1)
        return descrizione;
        else 
        return quantita + " " + descrizione;
   }
    
    
    @Override
    public boolean equals(Object obj) {
        DocFlavor.STRING
    }

    @Override
    public int compareTo(Coso o) {
       return this.descrizione.compareTo(o.descrizione);
       //return -(this.quantita-o.quantita);
    }
    
    
    
     
    
}
