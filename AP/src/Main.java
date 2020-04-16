public class Main {
    public static void main(String[] args){

        AutoHuur ah1( );
// Print "Eerste autohuur: " + ah1.toString()

        Klant k("Mijnheer de Vries");
        k.setKorting(10.0);
        ah1.setHuurder(k);
// Print: "Eerste autohuur: " + ah1.toString()

        Auto a1("Peugeot 207", 50);
        ah1.setGehuurdeAuto(a1);
        ah1.setAantalDagen(4);
// Print "Eerste autohuur:" + ah1.toString()

        AutoHuur ah2( );
        Auto a2("Ferrari", 3500);
        ah2.setGehuurdeAuto(a2);
        ah2.setHuurder(k);
        ah2.setAantalDagen(1);
// Print "Tweede autohuur: " + ah2.toString()

// Print "Gehuurd: " + ah1.getGehuurdeAuto()
// Print "Gehuurd: " + ah2.getGehuurdeAuto()

    }
}