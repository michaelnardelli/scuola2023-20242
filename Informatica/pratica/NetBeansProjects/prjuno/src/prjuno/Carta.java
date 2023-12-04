public class Carta {
    private int simbolo=-1;
    private int colore=-1;

    public void setSimbolo(int simbolo) {
        if (simbolo<0 || simbolo>14)
            System.out.println("simbolo non valido");
        else if ((simbolo>=13 && (colore==4 || colore==-1))||
                (simbolo<13 && (colore!=4 || colore==-1)))
            this.simbolo = simbolo;
        else System.out.println("simbolo: "+simbolo+" non valido con colore: "+colore);
    }

    public void setColore(int colore) {
        if (colore<0 || colore>5) // diversa da sopra
            System.out.println("colore non valido");
        else if ((colore==4 && (simbolo>=13 || simbolo==-1))||
                (colore>=0 && (simbolo<13 || simbolo==-1)))
            this.colore = colore;
        else System.out.println("colore: "+colore+"non valido con simbolo: "+simbolo);
    }

    public Carta(int simbolo, int colore) {
        setSimbolo(simbolo);
        setColore(colore);
    }
    

/**
 * simbolo: 0-9, 10 divieto, 11 cambiogiro, 12 +2, 13 cc, 14 +4
 * colore: 0 rosso, 1 giallo, 2 verde, 3 blu, 4 nero
 */    
    
    public String toString() {
        String stampa=""; 
        if (colore==-1 && simbolo==-1)
            return "Carta Inesistente";
        switch (colore) {
            case 0: stampa="\033[1;31m"; break;
            case 1: stampa="\033[1;33m"; break;
            case 2: stampa="\033[1;32m"; break;
            case 3: stampa="\033[1;34m"; break;
            default: stampa="\033[1;30m";
        }
        switch (simbolo) {
            case 14:    stampa+="+4";
                        break;
            case 13:    stampa+="cambia colore";
                        break;
            case 12:    stampa+="+2";
                        break;
            case 11:    stampa+="cambio giro";
                        break;
            case 10:   stampa+="salta turno";
                        break;
            default:  stampa+=simbolo;
        }
    return stampa;    
    }
    
    
    
}
