package odevler;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        //Kullanicidan alinan password 'pwd123!' oldugunda, verilen password'un dogru olup olmadigini kontrol eden
        //ve kullaniciya uygun mesaj veren kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi girin");
        String pwd = input.next();
        if (pwd.substring(0,1).equals("p")){
            if (pwd.substring(1,2).equals("w")){
                if (pwd.substring(2,3).equals("d")){
                    if (pwd.substring(3,4).equals("1")){
                        if (pwd.substring(4,5).equals("2")){
                            if (pwd.substring(5,6).equals("3")){
                                if (pwd.substring(6,7).equals("!")){
                                    System.out.println("Sifre dogru");}
                                else {
                                    System.out.println("Hatali sifre!");
                                }
                            }else {
                                System.out.println("Hatali sifre!");
                            }}else {
                            System.out.println("Hatali sifre!");
                        }
                    }else {
                        System.out.println("Hatali sifre!");
                    }
                }else {
                    System.out.println("Hatali sifre!");
                }
            }else {
                System.out.println("Hatali sifre!");
            }

        }else {
            System.out.println("Hatali sifre!");
        }


    }
}
