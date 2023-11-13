package provaarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ProvaArrayList {


    public static void main(String[] args) {
        //ArrayList<Coso> cosi = new ArrayList<Coso>();
        ListaOrdinata studenti = new ListaOrdinata();
        Coso tmp = new Coso("devid");
        studenti.aggiungi(tmp);
        tmp = new Coso("erik", 1);
        studenti.aggiungi(tmp);
        tmp = new Coso("Dario");
        studenti.aggiungi(tmp);
        System.out.println(studenti);
        Collections.sort(studenti.getCosi());
        System.out.println(studenti);
    }
    
}
