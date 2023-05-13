package Calismalarim;

public class VariablesAndMethods {
    public  static void main(String[] args) {
        // Variable ornekleri:
        int a = 3651;
        boolean isMarried = true;
        double gomlekFiyati = 399.99;
        String cityName = "İzmir";
        cityName = "Antalya";
        System.out.println(a);
        System.out.println(isMarried);
        System.out.println(gomlekFiyati);
        System.out.println(cityName);
        System.out.println(cityName);
        //method
        System.out.println(cemberAlani(5));
        print();
        // isim karti yazdirmak
        String isim = "Songul";
        String soyİsim = "Çelik";
        byte yas = 32;
        double boy = 1.60;
        int kilo = 60;

        System.out.println("isim: " + isim);
        System.out.println("soyİsim: " + soyİsim);
        System.out.println("yas: " + yas);
        System.out.println("boy: " + boy);
        System.out.println("kilo: " + kilo);

        System.out.println(hacim(5,6));}
    //Method ornekleri:
    public static double cemberAlani (double r){
        return 3.14 * r * r ;}
    private static void print (){
        System.out.println("İ am happy");}
    //kare prizmanın hacmini bulan ve donduren bir method yazınız
    public static int hacim(int a, int h){return a*a*h;}}




