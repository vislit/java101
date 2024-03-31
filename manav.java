/*
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
 */
import java.util.*;
public class manav {
    public static void main (String[]args){
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00,
                akg, ekg, dkg, mkg, pkg, total;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kaç kilo armut aldınız?: ");
        akg=inp.nextDouble();
        System.out.print("Kaç kilo elma aldınız?: ");
        ekg=inp.nextDouble();
        System.out.print("Kaç kilo domates aldınız?: ");
        dkg=inp.nextDouble();
        System.out.print("Kaç kilo muz aldınız?: ");
        mkg=inp.nextDouble();
        System.out.print("Kaç kilo patlıcan aldınız?: ");
        pkg=inp.nextDouble();
        total = (akg*armut) + (ekg*elma) + (dkg*domates) + (mkg*muz) + (pkg*patlican);
        System.out.print("Ödemeniz gereken ücret: "+total+ " TL");
    }
}
