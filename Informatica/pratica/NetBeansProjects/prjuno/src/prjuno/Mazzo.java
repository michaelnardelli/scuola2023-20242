package prjuno;


class Mazzo {

  

    public Mazzo() {
        

    
        Carta[] mazzo = new Carta[108];
        int x = 0;

        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 14; j++) {
                mazzo[x] = new Carta(i, j);
                x++;
                if (i != 0) {
                    mazzo[x] = new Carta(i, j);
                    x++;
                }
            }
        }

        return mazzo;
    }

    
    
    public void distribuisci(int numGiocatori) {
        int numCartePerGiocatore = this.carte.length / numGiocatori;

        for (int i = 0; i < numGiocatori; i++) {
            Carta[] mano = new Carta[numCartePerGiocatore];
            for (int j = 0; j < numCartePerGiocatore; j++) {
                mano[j] = this.carte[j * numGiocatori + i];
            }
            System.out.println("Giocatore " + (i+1) + ": " + carte.toString(mano));
        }
    }
}
