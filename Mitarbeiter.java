public class Mitarbeiter extends Mensch {

    int mitarbeiterNr;
    
    public Mitarbeiter(String vorname, String nachname, int mitarbeiterNR){
        super(vorname, nachname);
        setMitarbeiterNr(mitarbeiterNR);
    }

    public void setMitarbeiterNr(int mitarbeiterNr) {
        this.mitarbeiterNr = mitarbeiterNr;
    }
    public int getMitarbeiterNr() {
        return mitarbeiterNr;
    }
}
