import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        //1) Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin sayisini console a yazdiriniz
        String sinifMevcudu = "Sinif mevcudu 328 kisidir.";
        int yeniMev = sinifMevcudu.replaceAll("[0-9]", "").length();
        System.out.println(yeniMev);

        //2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri console a buyuk harflerle yazdiriniz
        String guzelGunler = "guzel gunler gorecegiz gunesli gunler";
        int sonKrakterİndex = guzelGunler.length() - 1;
        String sonhali = guzelGunler.substring(1, sonKrakterİndex).toUpperCase();
        System.out.println(sonhali);

        //3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin ASCII degerleri toplamini console a yazdiriniz
        int sonKarakterİndex = guzelGunler.length() - 1;
        int sonKarakterChar = guzelGunler.charAt(sonKarakterİndex);
        System.out.println(sonKarakterChar);
        int ilkKarakterİndex = guzelGunler.charAt(0);
        System.out.println(ilkKarakterİndex);
        System.out.println(ilkKarakterİndex + sonKarakterChar);

        //4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin ilk harfini buyuk harfle diger harflerini kucuk harflerle
        //    console a yazdirin
        String cityName = "  iZmiR ";
        String cityName2 = cityName.trim().substring(0,1).toUpperCase() + cityName.trim().substring(1).toLowerCase();
        System.out.println(cityName2);
        //5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        //        a)En az 6 character olsun
        //        b)En az bir tane buyuk harf olsun
        //        c)En az bir tane kucuk harf olsun
        //        d)En az bir tane rakam olsun
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi girin");
        String pwd = input.next();
        boolean bir = pwd.length() > 5;
        System.out.println("bir = " + bir);
        boolean iki = !pwd.contains(" ");
        System.out.println("iki = " + iki);
        boolean uc = pwd.replaceAll("[^A-Z]", "").length()> 0 ;
        System.out.println("uc = " + uc);
        boolean dort = pwd.replaceAll("[^a-z]", "").length() > 0;
        System.out.println("dort = " + dort);
        boolean bes = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("bes = " + bes);

        System.out.println("parola gecerli mi :" + (bir && iki && uc && dort && bes));
    }
}
