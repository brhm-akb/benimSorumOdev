package brahimsayisi3;

import java.util.Scanner;

public class BrahimSayisi3 {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Sayıyı Girin");
        int sayi;
        sayi = klavye.nextInt();
        
        Brahim hesaplamalar = new Brahim();
        hesaplamalar.Brahim(sayi);
        
    }
}
