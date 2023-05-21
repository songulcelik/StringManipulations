package odevler;

import java.util.Scanner;

public class HomeworkIf {
    public static void main(String[] args) {
        /*Haftanin gün ismini verdiginizde kacinci gün oldugunu yazan kodu yaziniz
         Pazar ==> 1.gün , Pazartesi  ==> 2.gün  .....*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen gun ismi giriniz");
        String dayName = input.nextLine();
        if (dayName.replaceAll("[A-Za-z]", "").length() == 0) {
            if (dayName.equalsIgnoreCase("pazartesi")) {
                System.out.println("1. gun");
            } else if (dayName.equalsIgnoreCase("sali")) {
                System.out.println("2. gun");
            } else if (dayName.equalsIgnoreCase("carsamba")) {
                System.out.println("3. gun");

            } else if (dayName.equalsIgnoreCase("persembe")) {
                System.out.println("4. gun");

            } else if (dayName.equalsIgnoreCase("cuma")) {
                System.out.println("5. gun");

            } else if (dayName.equalsIgnoreCase("cumartesi")) {
                System.out.println("6. gun");

            } else if (dayName.equalsIgnoreCase("pazar")) {
                System.out.println("7. gun");
            }
        } else {
            System.out.println("gecerli karakter giriniz");
        }










    }
}
