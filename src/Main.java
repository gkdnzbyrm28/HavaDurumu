import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int havad;

        Scanner utp = new Scanner(System.in);

        System.out.print("Bulundugunuz yerdeki hava durumunu giriniz.");
        havad = utp.nextInt();

        if (havad < 5){
            System.out.print("Kayak yapiniz");
        }
        else if (havad <= 25) {
            if (havad <= 15){
                System.out.print("Sinemaya gidebilirsin\n");
            }
            if (havad >= 10){
                System.out.print("Piknige gidebilirsin");
            }
        }
        else {
            System.out.print("Yuzmeye gidebilirsin");
        }
    }
}
