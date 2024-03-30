/*
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
 */
import java.util.*;
public class taksimetre {
    public static void main (String[] args){
        double perkm=2.20, acilis=10, toplam, yolucreti;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç km yol gittiniz?");
        double km = input.nextDouble();
        yolucreti = perkm*km;
        toplam = acilis + yolucreti;
        if(toplam<20){
            System.out.println("Ödemeniz gerek fiyat: 20 TL");
        }else{
            System.out.println("Ödemeniz gereken ücret: " +toplam+ " TL");
        }
    }
}
