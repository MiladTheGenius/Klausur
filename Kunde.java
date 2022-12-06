public class Kunde extends Mensch {
   
    int Kundennummer;
    int Alter;

    public Kunde(int Kundennummer, int Alter, String vorname, String nachname){
        super(vorname, nachname);
        setAlter(Alter);
        setKundennummer(Kundennummer);
    }

    public void setAlter(int alter) {
        Alter = alter;
    }
    public void setKundennummer(int kundennummer) {
        Kundennummer = kundennummer;
    }
    public int getAlter() {
        return Alter;
    }
    public int getKundennummer() {
        return Kundennummer;
    }
    
}
