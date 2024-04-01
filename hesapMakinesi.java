import java.util.*;
public class hesapMakinesi {
    public static void main (String[]args){
        Scanner input = new Scanner (System.in);
        System.out.print("1. sayıyı giriniz: ");
        int n1= input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        int n2= input.nextInt();
        System.out.println("Yapmak istediğiniz işlemin numarasına basınız: ");
        System.out.println("1)toplama \n 2)çıkarma \n 3)çarpma \n 4)bölme");
        int islem = input.nextInt();
        switch(islem){
            case 1:
                System.out.println("Seçtiğiniz sayıların toplamı: "+ (n1+n2));
                break;
            case 2:
                System.out.println("Seçtiğiniz sayıların farkı: "+ (n1-n2));
                break;
            case 3:
                System.out.println("Seçtiğiniz sayıların çarpımı: "+ (n1*n2));
                break;
            case 4:
                System.out.println("Seçtiğiniz sayıların bölme: "+ ((double)n1/n2));
                break;
        }
    }
}
