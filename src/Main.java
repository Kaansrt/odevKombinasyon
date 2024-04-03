import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n, r, nfakt = 1,rfakt = 1,fakt1=1;
        int komb;
//        n! / (r! * (n-r)!) fakt formülü.
        System.out.print("N değerini girniz : ");
        n = inp.nextInt();
        System.out.print("R değerini giriniz : ");
        r = inp.nextInt();
        //n'in fakt'ı
        for (int i = 1; i <= n; i++) {
            nfakt = i * nfakt;
        }
        //r nin fakt'ı
        for (int i = 1; i <= r; i++) {
            rfakt = i * rfakt;
        }
        //n-r fakt'ı
        for (int i = 1; i <= (n-r); i++) {
            fakt1 = i * fakt1;
        }
        komb = nfakt / (rfakt * (fakt1));
        System.out.println(komb);
    }
}