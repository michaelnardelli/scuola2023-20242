package xunardelli;
// Marco Xu  Michael Nardelli

import java.util.Objects;

public class Libri {
    String isbn;
    String titolo;
    String autore;
    Genere genere;
    int annoPubblicazione;
    int nrCopie;
    
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        if(isbn.length()==13 && this.isbn == null){
            this.isbn=isbn;
        }else{
            System.out.println("length di isbn not correct / isbn already exists");
        }
    }
    
    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public Genere getGenere() {
        return genere;
    }

    public void setGenere(Genere genere) {
        this.genere = genere;
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNrCopie() {
        return nrCopie;
    }

    public void setNrCopie(int nrCopie) {
        this.nrCopie = nrCopie;
    }

    public Libri(String isbn, String titolo, String autore, Genere genere, int annoPubblicazione, int nrCopie) {
        setIsbn(isbn);
        setTitolo(titolo);
        setAutore(autore);
        setGenere(genere);
        setAnnoPubblicazione(annoPubblicazione);
        setNrCopie(nrCopie);
    }
    
    @Override
    public String toString(){
        String str="";
        str= getIsbn() + getTitolo() + getAutore() + getGenere() + getAnnoPubblicazione() + nrCopie ;
        return str;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libri other = (Libri) obj;
        return Objects.equals(this.isbn, other.isbn);
    }

    
    
    
}
