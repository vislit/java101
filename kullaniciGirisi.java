import java.util.*;
public class kullaniciGirisi {
    public static void main (String[]args){
        Scanner inp = new Scanner(System.in);
        String userspassword = "vislit1234";
        System.out.print("Kullanıcı adınızı giriniz: ");
        String username = inp.next();
        System.out.print("Şifrenizi giriniz: ");
        String password = inp.next();

        //ilk koşulu sorguluyorum

        if(password.equals(userspassword)){
            System.out.println("Sayın "+ username + " giriş yaptınız!");
        }else{
            System.out.println("Şifreniz yanlıştır. Şifrenizi sıfırlamak ister misiniz? E/H");
            String choice = inp.next();

            //şifre yanlışsa kullanıcının ne yapmak istediğini soruyorum

            switch (choice) {
                case "H":
                    System.out.println("İyi günler.");
                    break;
                    case "E":
                        System.out.println("Yeni bir şifre belirleyiniz: ");
                        String newpassword = inp.next();
                        //şifreyi sıfırlamak isteyen kullanıcıuı eski şifresini tekrarlıyor mu diye kontrol ediyorum
                        if(newpassword.equals(userspassword)){
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        }else{
                            System.out.println("Şifre oluşturuldu.");
                        }
                        break;
                        default:
                            System.out.println("Olmayan bir seçenek girdiniz.");
            }
        }
    }
}
