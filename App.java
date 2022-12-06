public class App {
    public static void main(String[] args) throws Exception{
        Kunde k1;
        k1 = new Kunde(1324234, 17, "Muhamed", "Ahmed");
        Medien m1;
        m1 = new BlueRay("John Wick", 18, "2:03", false);
        


        if(k1.getAlter() == m1.getFsk()){
            System.out.println("Alter passt");
        }else {
                System.out.println("Alter passt nicht");
            }

    }
}
