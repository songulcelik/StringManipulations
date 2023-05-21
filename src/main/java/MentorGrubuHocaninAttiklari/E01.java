package MentorGrubuHocaninAttiklari;

import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
         *  dort islemden biri ile isleme koyup sonucun yazdiriniz
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Iki sayi giriniz");
        double num1 = input.nextDouble();
        double num2 =input.nextDouble();
        System.out.println("toplama icin --> 1" +
                "\ncikarma icin --> 2" +
                "\ncarpma icin --> 3" +
                "\nbolme icin --> 4" +
                "\ntuslayiniz");

        String islem = input.next();

        if (islem.equals("1")){
            System.out.println( num1+num2);
        } else if (islem.equals("2")){
            System.out.println( num1-num2);
        } else if (islem.equals("3")){
            System.out.println(num1*num2);
        } else if (islem.equals("4")){
            System.out.println(num1/num2);
        } else {
            System.out.println("Hatali giris");
        }

        /* TASK :
         *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
        INFO :
        BMI = kilo(kg) /(boy*boy)(m)
        BMI <=20 oldukca zayifsiniz
        20<BMI<=25 Normal sinirlardasiniz
        25<BMI<=30 Sisman kategorisindesiniz
        30<BMI ==> Obez grubundasiniz.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu m cinsinden giriniz");
        double boy = scan.nextDouble();
        System.out.println("Lutfen kilonuzu kg cinsinden giriniz");
        double kilo = scan.nextDouble();
        double BMI = kilo/boy;
        
        if (BMI<= 20){
            System.out.println("oldukca zayifsiniz");
        } else if (BMI>20 && BMI<=25) {
            System.out.println("Normal sinirlardasiniz");
        } else if (BMI>25 && BMI<=30) {
            System.out.println("Sisman kategorisindesiniz");
        } else if (BMI>30) {
            System.out.println("Obez grubundasiniz");
        }

    }
}
