package Bib;

/**
 * Vincent Verboven
 * 17/10/2022
 */
public class Boek {
    private String auteur;
    private String titel;
    private int paginas;
    private boolean ontleend;

    public Boek(){
        this("Onbekend","Onbekend",0);
    }

    public Boek(String auteur, String titel, int paginas){
        this.auteur = auteur;
        this.titel = titel;
        this.paginas = paginas;
        this.ontleend = false;
    }


    public void setAuteur(String auteur){
        if(!auteur.isEmpty()) this.auteur = auteur;
    }

    public void setTitel(String titel){
        if(!titel.isEmpty()) this.titel = titel;
    }

    public void setPaginas(int paginas){
        if(paginas > 0) this.paginas = paginas;
    }

    public void setOntleend(boolean ontleend){
        this.ontleend = ontleend;
    }

    public String getAuteur(){
        return this.auteur;
    }

    public String getTitel(){
        return this.titel;
    }

    public int getPaginas(){
        return this.paginas;
    }

    public boolean getOntleend(){
        return this.ontleend;
    }
}