import java.util.*;
public class notOrt {
    public static void main (String[] args){
        Scanner input= new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz: ");
        int mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz: ");
        int fzk = input.nextInt();
        System.out.println("Kimya notunuzu giriniz: ");
        int kmy = input.nextInt();
        System.out.println("Türkçe notunuzu giriniz: ");
        int tr = input.nextInt();
        System.out.println("Tarih notunuzu giriniz: ");
        int trh = input.nextInt();
        System.out.println("Müzik notunuzu giriniz: ");
        int mzk = input.nextInt();
        double ort = (mat+fzk+kmy+tr+trh+mzk)/6;
        int ortalama = (int) ort;
        ortalama=ortalama>59?1:2;
        switch(ortalama){
            case 1:
                System.out.println("Geçtiniz");
                break;
            case 2:
                System.out.println("Kaldınız.");
                break;
        }

    }
}