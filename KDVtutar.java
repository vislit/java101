import java.util.*;
public class KDVtutar {
    public static void main(String [] args){
        double tutar , kdvOran1= 0.18 , kdvOran2 = 0.8;
        Scanner input= new Scanner(System.in);
        System.out.println("Ürünün ücretini giriniz.");
        tutar = input.nextDouble();
        if(tutar>0 && tutar<=1000){
            double kdvTutar = tutar*kdvOran1;
            double kdvliTutar = tutar+kdvTutar;
            System.out.println("KDV tutarınız: "+ kdvTutar);
            System.out.println("Vermeniz gereken ücret: "+ kdvliTutar);
        }else if(tutar>1000){
            double kdvTutar = tutar*kdvOran2;
            double kdvliTutar = tutar+kdvTutar;
            System.out.println("KDV tutarınız: "+ kdvTutar);
            System.out.println("Vermeniz gereken ücret: "+ kdvliTutar);
        }else{
            System.out.println("Geçersiz bir değer girdiniz.");
        }
        System.out.println("İyi günler, yine bekleriz!");
    }
}
