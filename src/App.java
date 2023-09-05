public class App {
    public static void main(String[] args) throws Exception {
        Maci maci = new Maci();
        Macska mici = new Macska();
        maci.hangotad("Brumm..");
        maci.mezetgyujt();
        maci.beallitNev("Gedeon");
        mici.hangotad("Miau...");
        mici.dorombol();
        mici.beallitNev("Muhammed");
        System.out.println("Macska neve: " + mici.getName() + " | Medve neve: " + maci.getName());
    }
}
