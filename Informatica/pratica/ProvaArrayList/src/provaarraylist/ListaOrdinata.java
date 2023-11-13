package provaarraylist;

import java.util.ArrayList;

public class ListaOrdinata {
    private ArrayList<Coso> cosi;
    
    public ListaOrdinata() {
        cosi = new ArrayList<Coso>(10);
    }
    
    void aggiungi(Coso c) {
        // se esiste già --> cosi[i]quantità+=c.quantità;
        int i = cosi.indexOf(c); // cerca la pos di c
        if (i!=-1)
            cosi.get(i).setQuantita(cosi.get(i).getQuantita()+c.getQuantita());
        // altrimenti aggiungi in fondo
        else cosi.add(c);
    }

    @Override
    public String toString() {
        return cosi.toString(); // cambiare
    }

    public ArrayList<Coso> getCosi() {
        return cosi;
    }

    public void setCosi(ArrayList<Coso> cosi) {
        this.cosi = cosi;
    }
    
    
    
}
