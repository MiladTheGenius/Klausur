public class Verleihung {

    Medien medTyp;
    Kunde kunde;

    public Verleihung(Medien medTyp){
        setKunde(kunde);
        setMedTyp(medTyp);
    }


    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }
    public void setMedTyp(Medien medTyp) {
        this.medTyp = medTyp;
    }
    public Kunde getKunde() {
        return kunde;
    }
    public Medien getMedTyp() {
        return medTyp;
    }

    
}
