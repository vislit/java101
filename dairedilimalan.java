import java.util.*;
public class dairedilimalan {
    public static void main (String [] args){
        double pi = 3.14, r, alfa, result;
        Scanner input = new Scanner(System.in);
        System.out.print("Daire dilimin yarıçapını giriniz: ");
        r = input.nextDouble();
        System.out.print("Daire dilimin açısını giriniz: ");
        alfa = input.nextDouble();
        result = (pi * r*r * alfa)/360;
        System.out.print("Belirttiğiniz daire dilimin alanı: "+result);
    }
}
