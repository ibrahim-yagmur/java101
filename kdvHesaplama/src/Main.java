import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         double tutar , kdvliFiyat , kdv = 0.18;

        Scanner imput = new Scanner(System.in);
        System.out.println("ürün tutarını giriniz: ");
        tutar = imput.nextDouble();
        System.out.println("kdv li fiyatını giriniz: ");
        kdvliFiyat = imput.nextDouble();
        System.out.println(kdv);
    }
}