package MentorGrubuHocaninAttiklari;

import java.util.Scanner;

public class hm {
    public static void main(String[] args) {


/*
     @author Mehmet Duran Kaya
 */
        Scanner input = new Scanner(System.in);

                /*
                Benden benliğim gitti,
                hep mülkümü dost yuttu,
                Lamekan kavmi oldum,
                mekanım yağma olsun
                           Yunus Emre (1238-1328)
               */

        String poem = "Benden benliğim gitti, Hep mülkümü dost yuttu, Lamekan kavmi oldum, Mekanım yağma olsun, Yunus Emre 1238-1328";
        String city = "Hatay";
        int startIndex = 1;
        int ilkIndex = 0;//dizinin ilk elemanı başlangıç noktası olsun.
        int lastIndex = poem.length() - 1;
        int feeling = 0;

        String misra1 = poem.split(",")[0];
        String misra2 = poem.split(",")[1];
        String misra3 = poem.split(",")[2];
        String misra4 = poem.split(",")[3];
        String misra5 = poem.split(",")[4];
        String author = poem;
        System.out.println("======================================");
        System.out.println(misra1 + "\n" +
                misra2 + "\n" +
                misra3 + "\n" +
                misra4 + "\n" +
                misra5 + "\n" + author);
        System.out.println("======================================");
        //kullanılacak variables

        /*------------------------ÇÖZÜMLER-------------------------

           1) Bir string variable olusturunuz ve bu string deki rakam olmayan
              tum karakterlerin sayisini console a yazdiriniz.
          */
        int str = poem.replaceAll("[0-9]", "").length();
        System.out.print("Rakam olmayan tüm değerler: " + str + "\n");
        System.out.println("-----------------------------------------");
        //-----------------------------------------------------------------------
         /*
         2) Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki
            tum karakterleri console a buyuk harflerle yazdiriniz
         */
        String str2 = poem.substring(startIndex, lastIndex).toUpperCase();
        System.out.print("İlk karakter ve son karakter dışındaki\n" +
                "tüm karakterler büyük harfle yazdılırılmıştır: \n" +
                str2 + "\n");
        System.out.println("-----------------------------------------");
        /*
         3) Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin
            ASCII degerleri toplamini console a yazdiriniz
         */
        //---------------------------------------------------------------------------
        int firstChar = poem.charAt(startIndex);
        int endChar = poem.charAt(lastIndex);
        int result = firstChar + endChar;
        System.out.print("Cümlenin ilk karakterinin değeri ile " +
                " Son karakterinin değeri toplamı: " + result + "\n");
        System.out.println("-----------------------------------------");
       /*
         4) Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin
            ilk harfini buyuk harfle diger harflerini kucuk harflerle console a yazdirin
       */
        String str4 = city.substring(ilkIndex, startIndex).toUpperCase();
        String str5 = city.substring(startIndex).toLowerCase();
        System.out.println("Tek kelimelik bir Şehir oluşturuldu.\n" +
                "Şehir isminin ilk harfi büyük\n" +
                "diğer harfleri küçük yazdırıldı: " + str4 + str5);//concatenation birleştirme
        System.out.println("-----------------------------------------");
        //----------------------------------------------------------------------------

        System.out.print("Kullanıcı Adınızı giriniz: ");
        String user = input.nextLine();
        String userName = user.trim().toUpperCase();
        System.out.print("lütfen şifrenizi giriniz: ");
        String pwd = input.nextLine();
        System.out.println("-----------------------------------------");
         /*
         5)Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
       */
        //a)En az 6 character olsun
        boolean p1 = pwd.length() > 5;
        //b)En az bir tane buyuk harf olsun
        boolean p2 = pwd.replaceAll("[^A-Z]", "").length() > 0;
        //c)En az bir tane kucuk harf olsun
        boolean p3 = pwd.replaceAll("[^a-z]", "").length() > 0;
        //d)En az bir tane rakam olsun
        boolean p4 = pwd.replaceAll("[^0-9]", "").length() > 0;
        //EXTRA****************FRD'ye ters düşecek ama:))************************

        if (p1 == false) {
            System.out.println("Şifre 6 karakterden az olamaz!");
        } else if (p2 == false) {
            System.out.println("Şifre en az 1 Büyük harf içermelidir!");
        } else if (p3 == false) {
            System.out.println("Şifre en az 1 küçük harf içermelidir!");
        } else if (p4 == false) {
            System.out.println("Şifre en az 1 rakam içermelidir!");
        } else {
            System.out.println("Hoş geldiniz. " + userName + "\n");
            System.out.print("Merhaba " + userName + " lütfen duygu durumunuzu belirtiniz.\n" +
                    "1-Süper 2- İyi 3- Eh İşte 4-Kötü 5- Yorum Yok => : ");
            feeling = input.nextInt();
            switch (feeling) {
                case 1:
                    System.out.println("Buna çok sevindim çünkü sizin için önereceğim\n" +
                            "süper şarkılar ve sürprizler var ayrıca\n" +
                            "market bugün harika biliyor musun? ");
                    break;
                case 2:
                    System.out.println("Ben genelde acı bir türk kahvesi içtikten sonra\n" +
                            "Süper oluyorum tavsiye ederim.");
                    break;
                case 3:
                    System.out.println("O zaman size bir Neşet Ertaş gider:))");
                    break;
                case 4:
                    System.out.println("Üzgünün insanın kötü hissetmesine çare olamam\n" +
                            "bu duygu durumunu değiştirmelisin.Aksi halde klavyemi bozacaksın");
                    break;
                case 5:
                    System.out.println("Kendinizi iyi hissettiğinde görüşmek üzere");

            }
            System.out.println("0-Çıkış  Kalmak için '0' dışında bir rakama dokunun. ");
            int select = input.nextInt();

            if (select != 0) {

                System.out.println("Tekrar hoş geldiniz umarım iyisiniz. " + userName);
                System.exit(select);

            } else {
                System.out.println("Hoşçakalın" + userName);
                System.exit(select);
            }
        }

    }}
