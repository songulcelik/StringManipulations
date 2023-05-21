package Calismalarim;

import java.util.Scanner;

public class Karisik1 {
    public static void main(String[] args) {
        //Girilen ayin sayisina gore mevsimi veren kodu yaziniz.(1-12) geri kalanlar olasiliklar icin hata mesaji verilen kodu yaziniz
        //12 -1 -2 ==>KIS
        //3-4-5==>ilkbahar
        //6-7-8  ==>yaz
        //9-10-11==>sonbahar
        //input ==> 2 output==> Kis
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ay sayisi giriniz");
        String ay = input.nextLine();

        if (ay.replaceAll("[0-9]", "").length()==0){
            if (ay.equals("12") || ay.equals("1") || ay.equals("2")){
                System.out.println("KIS");
            }  if (ay.equals("3") || ay.equals("4") || ay.equals("5")){
                System.out.println("ILKBAHAR");}
            if (ay.equals("6") || ay.equals("7") || ay.equals("8")){
                System.out.println("YAZ");
            } if (ay.equals("9") || ay.equals("10") || ay.equals("11")){
                System.out.println("SONBAHAR");
            }}
        else {
            System.out.println("Girilen ay sayisi hatali");}

        //Soru 2
//Girilen ayin ismine gore mevsimi veren kodu yaziniz.
//Aralik-ocak-subat ==>KIS\
// mart -nisan mayis==>ilkbahar
//haziran -temmuz agustos ==>yaz
//eylul -ekim -kasim==>sonbahar
//input ==> Ocak output==> Kis
    }
}
