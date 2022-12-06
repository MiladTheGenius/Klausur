public class CD extends Medien{

    String LPoSP;

    public CD(String titel, int fsk, String länge, String LPoSP) {
        super(titel, fsk, länge);
        setLPoSP(länge);
    }

    public void setLPoSP(String lPoSP) {
        LPoSP = lPoSP;
    }

    public String getLPoSP() {
        return LPoSP;
    }

    
}
