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
        char second = s.charAt(1);
        char secondLast = s.charAt(24);
        System.out.println("" + second + secondLast);

        //s deki karakter sayısını bul
        int sLength = s.length();
        System.out.println(sLength);

        //s deki ilk 5 karakteri al
        String firstC = s.substring(0, 5);
        System.out.println(firstC);

        //s deki "goren" kelimesini al
        String goren = s.substring(6, 11);
        System.out.println(goren);

        //s de "cirkin" kelimesi var mı
        boolean varMı = s.contains("cirkin");
        System.out.println(varMı);

        // s nin belli bir harfle ya da kelimeyle baslayip baslamadigini kontrol et
        boolean isStart = s.startsWith("Guzel");
        System.out.println(isStart);
        boolean isStart1 = s.startsWith("G");
        System.out.println(isStart1);

        //s 9.karakterden itibaren e ile basliyor mu
        boolean dokuzc = s.startsWith("e", 9);
        System.out.println(dokuzc);

        String l = "Learn Java earn money";

        // l Stringi "money" ile bitiyor mu
        boolean isEnd = l.endsWith("money");
        System.out.println(isEnd);

        // l deki "money" i "dollar" ile degistir
        String l1 = l.replace("money", "dollar");
        System.out.println(l1);

        // l deki tüm a lari * a cevir
        String l2 = l.replace('a', '*');
        System.out.println(l2);

        String t = "İstanbul 1453 yilinda fethedildi...";

        //t deki tüm rakamlari "*"a cevir
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

        //Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        //karakter sayısının toplamını yazdırınız

        String name1 = "Songul";
        String name2 = "Songul Yildiz";
        String name3 = "Songul Yildiz Celik";

        int karakterTop = name1.length() + name2.replace(" ", "").length() + name3.replace(" ", "").length();
        System.out.println(karakterTop);

        //Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
        //konsolda yazdırınız

        String kod = "kgo&/12.66,-9";
        int kodu = kod.replaceAll("[0-9]", "").length();
        System.out.println(kodu);

        //Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız
        String n = "  AHmet CelİK ";
        char first = n.trim().toUpperCase().charAt(0);
        char secondd = n.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("" + first + secondd);

        //bir stringin hic karakter icermedigini kontrol et
        String m = "";
        boolean isEmpty = m.length() == 0;
        System.out.println("bos mu = " + isEmpty);
        //2.yol
        boolean m2 = m.isEmpty();
        System.out.println("is empty" + m2);

        //bir stringin spaca haric karakter icermedigini kontrol edin
        String a = "  ";
        boolean a1 = a.replaceAll(" ", "").length() == 0;
        System.out.println(a1);
        //2.yol
        boolean a2 = a.replaceAll(" ", "").isEmpty();
        System.out.println(a2);
        //3.yol
        boolean a3 = a.isBlank();
        System.out.println(a3);

        //bir stringdeki a  i e characterlerinin ilk gorunumlerinin indexleri top
        String b = "Java is easy to learn";
        int ilkA =b.indexOf('a');
        int ilkE =b.indexOf('e');
        int ilkI = b.indexOf('i');
        System.out.println( ilkA + ilkI + ilkE);
        //a e i nin son gorunumlerinin index toplami
        int sonA = b.lastIndexOf('a');
        int sonE = b.lastIndexOf('e');
        int sonI = b.lastIndexOf('i');
        System.out.println( sonI + sonE + sonA );

        //belli bir karakterden baslayarak belli bir karaktere kadar. gmail al
        String c = "abc@gmail.com";
        int startIndex = c.indexOf('@')+1;
        int endIndex = c.indexOf('.');
        String companyName = c.substring(startIndex , endIndex);
        System.out.println(companyName);


    }
}
