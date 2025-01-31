import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;
        int toplam = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("üssü alınacak sayıyı giriniz: ");
        a = sc.nextInt();
        System.out.println("üs olacak sayıyı giriniz:");
        b = sc.nextInt();
        for (int i = 1; i <= b; i++) {
               toplam*=a;
        }
        System.out.println(toplam);

    }
}
