public class Schallplatte extends Medien {

    boolean verleihen;

    public Schallplatte(String titel, int fsk, String länge, boolean verleihen) {
        super(titel, fsk, länge);
        setVerleihen(verleihen);
    }

    public void setVerleihen(boolean verleihen) {
        this.verleihen = verleihen;
    }
    public boolean verleihen() {
        return verleihen;
    }
    
}
