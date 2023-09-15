import java.util.Random;

public class Main {

    /**
     * szyfruj - metoda szyfrująca slowo szyfrem cezara z kluczem
     * @param slowo - slowo przekazane do zaszyfrowania
     * @param klucz - liczba calkowita ktora okresla przesuniecie w alfabecie
     * @return zaszyfrowane slowo
     */
    public static String szyfruj(String slowo, int klucz){
        String szyfr ="";
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        klucz = klucz%alfabet.length();
        String alfabetPrzesuniety = alfabet.substring(klucz)+alfabet.substring(0,klucz);
        for (int i = 0; i < slowo.length(); i++) {
            szyfr = szyfr + alfabetPrzesuniety.charAt(alfabet.indexOf(slowo.charAt(i)));
        }
        //System.out.println(alfabet);
        //System.out.println(alfabetPrzesuniety);
        return szyfr;
    }

    private static boolean czyHasloZawieraCos(String haslo, String ciag){
        for (int i = 0; i < ciag.length(); i++) {
            char litera =ciag.charAt(i);
            if(haslo.indexOf(litera) >=0){
                return true;
            }
        }
        return false;
    }
    public static String generujHaslo(int dl){
        String haslo ="";

        String wszystkieZnaki ;
        String maleLitery="qwertyuiopasdfghjklzxcvbnm";
        String duzeLitery = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String znakiSpecjalne = "!@#$%^&*()_+=-/?|><,.";
        String cyfry = "1234567890";
        wszystkieZnaki = maleLitery+duzeLitery+znakiSpecjalne+cyfry;
        for (int i = 0; i < dl; i++) {
            int losowa = (int) (Math.random()*wszystkieZnaki.length());
            System.out.println(losowa);
            haslo = haslo + wszystkieZnaki.charAt(losowa);
        }
        boolean czyMalaLitera = czyHasloZawieraCos(haslo,maleLitery);
        boolean czyDuzaLitera = czyHasloZawieraCos(haslo,duzeLitery);
        boolean czyZnakSpecjalny = czyHasloZawieraCos(haslo,znakiSpecjalne);
        boolean czyCyfra = czyHasloZawieraCos(haslo,cyfry);
        //TODO: dokonczyc

        return haslo;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(szyfruj("abc",3));
        System.out.println(generujHaslo(20));
    }
}