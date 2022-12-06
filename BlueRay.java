public class BlueRay extends Medien {

    boolean dreiD; 

    public BlueRay(String titel, int fsk, String länge, boolean dreiD) {
        super(titel, fsk, länge);
        setDreiD(dreiD);;
    }

    public void setDreiD(boolean dreiD) {
        this.dreiD = dreiD;
    }
    
    public boolean getDreiD() {
        return dreiD;
    }
}
