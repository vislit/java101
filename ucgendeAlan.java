import java.util.*;
public class ucgendeAlan {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double u, a, b, c, alan;
        System.out.println("Üçgenin bir kenarını giriniz.");
        a = input.nextDouble();
        System.out.println("Üçgenin bir kenarını giriniz.");
        b = input.nextDouble();
        System.out.println("Üçgenin bir kenarını giriniz.");
        c = input.nextDouble();
        u= ((a + b + c)/2);
        alan= Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: "+ alan);
    }
}
