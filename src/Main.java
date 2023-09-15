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

    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(szyfruj("abc",3));
    }
}