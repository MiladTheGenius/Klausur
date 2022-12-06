public class DVD extends Medien {
    
    boolean fullhd;

    public DVD (String titel, int fsk, String länge, String info, boolean fullhd){
        super(titel, fsk, länge);
        setFullhd(fullhd);
    }

    public void setFullhd(boolean fullhd) {
        this.fullhd = fullhd;
    }
    public boolean Fullhd() {
        return fullhd;
    }

    
}
