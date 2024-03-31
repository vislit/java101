import java.util.*;
public class vucutkitleindeksi {
    public static void main (String [] args){
        double kg, m, vki;
        Scanner input = new Scanner(System.in);
        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        kg = input.nextDouble();
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        m = input.nextDouble();
        vki = kg / (m * m);
        System.out.println("Vücut kitle indeksiniz : "+vki);
    }
}
