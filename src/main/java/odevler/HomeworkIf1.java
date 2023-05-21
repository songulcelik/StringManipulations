package odevler;

import java.util.Scanner;

public class HomeworkIf1 {
    public static void main(String[] args) {
        /*3)Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
         1==> January, 2 ==> February ..... */
        Scanner month = new Scanner(System.in);
        System.out.println("Lutfen kacinci ay oldugunu giriniz");
       String month1 = month.next();
       if (month1.replaceAll("[0-9]", "").length()==0){
           if (month1.equals("1") ){
               System.out.println("Ocak");
           } else if (month1.equals("2")) {
               System.out.println("Subat");
           } else if (month1.equals("3")) {
               System.out.println("Mart");}
               else if (month1.equals("4")) {
               System.out.println("Nisan");
           } else if (month1.equals("5")) {
               System.out.println("Mayis");
           } else if (month1.equals("6")) {
               System.out.println("Haziran");
           } else if (month1.equals("7")) {
               System.out.println("Temmuz");
           } else if (month1.equals("8")) {
               System.out.println("Agustos");
           } else if (month1.equals("9")) {
               System.out.println("Eylül");
           } else if (month1.equals("10")) {
               System.out.println("Ekim");
           } else if (month1.equals("11")) {
               System.out.println("Kasim");
               } else if (month1.equals("12")) {
               System.out.println("Aralik");
               }}
       else {System.out.println("lutfen 1-12 arasinda sayi giriniz.");
       }

    }
}

