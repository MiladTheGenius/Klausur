public abstract class Medien {

    String titel;
    int fsk;
    String länge;
    
    public Medien(String titel, int fsk, String länge){
        setFsk(fsk);
        setLänge(länge);
        setTitel(titel);
    }

    public void setFsk(int fsk) {
        this.fsk = fsk;
    }
    public void setLänge(String länge) {
        this.länge = länge;
    }
    public void setTitel(String titel) {
        this.titel = titel;
    }
    
    public int getFsk() {
        return fsk;
    }
    public String getLänge() {
        return länge;
    }
    public String getTitel() {
        return titel;
    }




    
}
