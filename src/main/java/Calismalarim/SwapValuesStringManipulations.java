package Calismalarim;

public class SwapValuesStringManipulations {
    public static void main(String[] args) {
        String s = "Guzel goren guzel dusunur.";
        //tum karakterler buyuk olsun.
        String toUpper = s.toUpperCase();
        System.out.println(toUpper);

        //tum karakterler kucuk olsun
        String toLower = s.toLowerCase();
        System.out.println(toLower);

        // s stringindeki ilk karakteri al
        char ilkC = s.charAt(0);
        System.out.println(ilkC);

        //s deki bastan ikinci ve sondan ikinci karakter
        char second =s.charAt(1);
        char secondLast = s.charAt(24);
        System.out.println("" + second + secondLast );

        //s deki karakter sayısını bul
        int sLength = s.length();
        System.out.println(sLength);

        //s deki ilk 5 karakteri al
        String firstC = s.substring(0,5);
        System.out.println(firstC);

        //s deki "goren" kelimesini al
        String goren = s.substring(6,11);
        System.out.println(goren);

        //s de "cirkin" kelimesi var mı
        boolean varMı = s.contains("cirkin");
        System.out.println(varMı);

        // s nin belli bir harfle ya da kelimeyle baslayip baslamadigini kontrol et
        boolean isStart = s.startsWith("Guzel");
        System.out.println(isStart);
        boolean isStart1 =s.startsWith("G");
        System.out.println(isStart1);

        //s 9.karakterden itibaren e ile basliyor mu
        boolean dokuzc = s.startsWith("e", 9);
        System.out.println(dokuzc);
    }
}
