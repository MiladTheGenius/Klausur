public class BlueRay extends Medien {

    String info; 

    public BlueRay(String titel, int fsk, String länge, String info) {
        super(titel, fsk, länge);
        setInfo(info);
    }
    
    public void setInfo(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
    
}
