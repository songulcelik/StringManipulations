package MentorGrubuHocaninAttiklari;

import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        /*
        TASK :
        Kullanicidan  yasini ve kilosunu alaliniz
        18 yasindan kucuk ise kan bagisi yapamaz
        18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
        18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen yasinizi girin");
        int yas = input.nextInt();
        System.out.println("Lutfen kilonuzu girin");
        int kilo = input.nextInt();

        if (yas> 18){
            if (kilo<50){System.out.println("kan bagisi yapamaz");
            } else {System.out.println("kan bagisi yapabilir");
            }} else {System.out.println("kan bagisi yapamaz");
        }
    }
}
