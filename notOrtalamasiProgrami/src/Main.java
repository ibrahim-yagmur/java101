import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int birinciD , ikinciD ,ffinal;
        double ortalama;
        /*Scanner imput = new Scanner(System.in);
        System.out.println("quiz notunu giriniz : ");
        quiz = imput.nextInt();
        System.out.println("vize notunu giriniz : ");
        vize = imput.nextInt();
        System.out.println("final notunu giriniz : ");
        ffinal = imput.nextInt();

        ortalama = (quiz * 0.2) + (vize * 0.35) + (ffinal * 0.45);
        System.out.println(ortalama);
        System.out.println("ortalama ile geçtiniz : " + ortalama);*/
        Scanner imput = new Scanner(System.in);
        System.out.println("birinci dönem notunu giriniz: ");
        birinciD = imput.nextInt();
        System.out.println("ikinci dönem notunu giriniz: ");
        ikinciD = imput.nextInt();
        System.out.println("final notunu giriniz: ");
        ffinal = imput.nextInt();

        ortalama = (birinciD * 0.2) + (ikinciD * 0.35) + (ffinal * 0.45);
        System.out.println(ortalama);
    }
}