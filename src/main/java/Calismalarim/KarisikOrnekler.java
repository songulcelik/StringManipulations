package Calismalarim;

public class KarisikOrnekler {
    public static void main(String[] args) {
      //Ornek1:
        int sayı1 = 5;
        int sayı2 = 2;
        int sonuç = sayı1 / sayı2;
        System.out.println(sonuç);
        //Ornek2: Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        //ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        //yazdırınız.
        String cityName = "izMir";

        String  cityName2 = cityName.substring(0,1).toUpperCase() + cityName.substring(1).toLowerCase();
        System.out.println(cityName2);

        //Ornek3 : Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        //konsolda yazdırınız.
        String a = "Angd123.,!!56gf.";
        int a1 = a.replaceAll("[^0-9A-Za-z]", "").length();
        System.out.println(a1);


    }
}
