package Calismalarim;

import java.util.Scanner;

public class Karisik {
    public static void main(String[] args) {
        //   Kullanicidan 3 kelimelik bir cumle istayin  girilen en uzun kelimeyi ekrana yazdirin.
       //   Kelime uzunluklari birbirine esitse ekrana en az iki kelime birbirne esit yazsin

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen uc kelimelik bir cumle giriniz");
        String sentence = input.nextLine();
        int firstSpace = sentence.indexOf(" ");
        int secondSpace = sentence.lastIndexOf(" ");
        int word1 = sentence.substring(0, firstSpace).length();
        String word11 = sentence.substring(0,firstSpace);
        int word2 = sentence.substring(firstSpace+1, secondSpace).length();
        String word22 = sentence.substring(firstSpace+1, secondSpace);
        int word3= sentence.substring(secondSpace+1).length();
        String word33 = sentence.substring(secondSpace+1);
        if (word1> word2 && word1> word3){
            System.out.println(word11);
        } else if (word2>word1 && word2 >word3) {
            System.out.println(word22);
        }else if (word3> word1 && word3> word2){
            System.out.println(word33);
        } else {
            System.out.println("en az iki kelime birbirne esit");
        }

        /*

        // kullanıcıdan yaşını ve vatandaşlık durumunu kontrol eden bir program yaziniz
        // Programınız, kullanıcının 18 yaşından büyük ve Türkiye vatandaşı olup olmadığını kontrol etmeli ve
        // buna göre uygun bir mesaj vermelidir. Eğer kullanıcı 18
        // yaşından büyükse ve Türkiye vatandaşı ise "Ehliyet alabilirsiniz."mesajını yazdırmalıdır.
        // Aksi takdirde, "Ehliyet almak için gereksinimleri sağlamıyorsunuz." mesajını yazdırmalıdır.

        /*




         */
        // Bir IT firması çalışanlarına Kurban Bayramı öncesi PRİM ve bayram İKRAMİYESİ verecektir.
        // Ünvan olarak; Development (D), Tester (T), Software için (S) girilecektir.
        // Kişinin Taban maaşı, tamsayı olarak girilecektir.
        // Kaç yıldır bu IT firmasında çalıştığı Tamsayı olarak girilecektir.

        // PRİM hesaplanırken ünvana bakılmaksızın, kişinin bu firmada kaç yıl çalıştığı baz alınacaktır,;
        // 5 ve daha az yıldır çalışanlara taban maaşının %10'u PRİM olarak verilecektir
        // 6 ve yukarı yıldır çalışanlara taban maaşının %15'i PRİM olarak verilecektir.
        // İKRAMİYE hesaplanırken kişinin ÜNVANI'na göre hesaplama yapılacaktır.
        // DEVELOPMENT ise; Taban Maaşı ve Prim toplamının % 7'si İKRAMİYE olarak verilecektir.
        // TESTER ise; Taban Maaşı ve Prim toplamının % 6'sı İKRAMİYE olarak verilecektir.
        // SOFTWARE ise; Taban Maaşı ve Prim toplamının % 5'i İKRAMİYE olarak verilecektir.

        // Bu verilere göre; TABAN MAAŞI, ÇALIŞTIĞI YIL ve ÜNVAN'ı girilen kişinin PRİM ve İKRAMİYESİNİ bulunuz...

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen unvaninizi girin");
        String unvan = scan.next();
        System.out.println("kac yildir bu sirkette calisiyorsunuz");
        int kacYil = scan.nextInt();
        System.out.println("lutfen taban maasinizi giriniz");
        double maas = scan.nextDouble();
        double prim1 = maas*10/100;
        double prim2 = maas*15/100;

      if (unvan.equalsIgnoreCase("d")){
          if (kacYil<=5){
              System.out.println("prim: "+ prim1);
              System.out.println("ikramiye: "+ (maas+prim1)*7/100);
          } else {
              System.out.println("prim: " + prim2);
              System.out.println("ikramiye: "+ (maas+prim2)*7/100);
          }

      } else if (unvan.equalsIgnoreCase("t")) {
          if (kacYil<=5){
              System.out.println("prim: "+ prim1);
              System.out.println("ikramiye: "+ (maas+prim1)*6/100);
          } else {
              System.out.println("prim: " + prim2);
              System.out.println("ikramiye: "+ (maas+prim2)*6/100);
          }

      } else if (unvan.equalsIgnoreCase("s")) {
          if (kacYil<=5){
              System.out.println("prim:"+ prim1);
              System.out.println("ikramiye:"+ (maas+prim1)*5/100);
          } else {
              System.out.println("prim" + prim2);
              System.out.println("ikramiye:"+ (maas+prim2)*5/100);
          }

      }
    }
}
