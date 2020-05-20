package brahimsayisi3;

import java.util.Scanner;

public class Brahim {
    int adet2 = 0;
    public void Brahim(int sayi) { // Sayının tersi ile burada toplanacak
        int ters = 0;
        int polindromik;
        int kalan;
        int yedekSayi = sayi;
        while(sayi != 0){
            kalan = sayi % 10;
            sayi = sayi / 10;
            ters = ters*10 + kalan;
        }
        
        polindromik = ters + yedekSayi;
        
        sağlama(polindromik);
        
    }

    public void sağlama(int polindromik) { // burada sayının polindromik olup olmadığı kontrol edilecek. eğer polindromik değilse hemen üstteki metoda geri gidip aynı işlemler yapılacaktır. Ta ki polindromik olana kadar.
        
        
        int ters = 0;
        int polindromik2;
        int kalan;
        int yedekSayi = polindromik;
        
        while (polindromik != 0) {            
            kalan = polindromik % 10;
            polindromik = polindromik / 10;
            ters = ters*10 + kalan;
        }
        
        if(ters == yedekSayi){
            asalCarpan(ters);
            
        }
        else{
            
            if(adet2 != 20){ 
                adet2++;
                Brahim(ters);
                
            }
            else{
                brahimDegildir();
            }
            
        }
        
    }
    
    public void asalCarpan(int sayi){
        int bolen=2;
        int bolunen=sayi;
        int asalCarpanlar[]=new int[500];//program hata vermesin diye
        int adet=1;
        asalCarpanlar[0]=0;
        asalCarpanlar[1]=1;
        int toplamlar=0;
        while(bolen<sayi){
            if(bolunen%bolen==0){
                asalCarpanlar[adet] = bolen;
                if(asalCarpanlar[adet-1] != asalCarpanlar[adet]){
                    asalCarpanlar[adet] = bolen;
                    //System.out.println(asalCarpanlar[adet]);
                    toplamlar = toplamlar + asalCarpanlar[adet];
                    
                    adet++;
                }
                else{
                    asalCarpanlar[adet] = 0;
                }
            bolunen/=bolen;
            }
            else{
            bolen++;
            }
        }
        //System.out.println(toplamlar);
        boolean durum = true;
        while(durum){
            asalMi(toplamlar);
            durum = false;
        }
            
        
    }
    
    private void asalMi(int sayi){
        int adet = 1;
        int sayac=0;
        for(int i=2;i<sayi;i++)
        {
            if(sayi==2){
                break;
            }
            else if(sayi%i==0){
                sayac++;
                break;
            }
        }
     
        if(sayac==0){
            //System.out.println("Girilen sayı asaldır."+sayi);
            Brahimdir();
         
        }
        else{
            //System.out.println("Girilen sayı asal değildir."+sayi);
            if(sayi < 10){
                adet++;
                if(adet == 2){
                    brahimDegildir();
                }
            }
            else{
                rakamTopla(sayi);
            }
        }
    }
    
    public void rakamTopla(int sayi){
        int kalan = 0;
        int rakamToplami = 0;
        while(sayi != 0 ){
            kalan = sayi % 10;
            sayi = sayi / 10;
            rakamToplami = rakamToplami + kalan;
            
        }
        
        asalMi(rakamToplami);
    }
    
    public void brahimDegildir(){
        System.out.println("BRAHİM SAYISI DEĞİLDİR");
    }
    
    public void Brahimdir(){
        System.out.println("BRAHİM SAYISIDIR");
    }
    
}
