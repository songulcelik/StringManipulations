package Calismalarim;

public class WrapperClass {
    public static void main(String[] args) {
        // Byte data tipinin minimum değeri ile short data tipinin maksimum değerinin toplamını
        //bulmak için bir kod yazınız.
        byte min = Byte.MIN_VALUE;
        byte max = Byte.MAX_VALUE;
        System.out.println(min + max);

        //Data tipi String olan “103” değerini byte data tipine dönüştürmek için bir kod yazınız ve
        //yine data tipi String olan “2351” değerini short data tipine dönüştürüp konsolda iki
        //değişken arasındaki farkı yazdırınız.
        byte num1 = Byte.valueOf("103");
        short num2 = Short.valueOf("2351");
        System.out.println(num2 - num1);


    }

}
