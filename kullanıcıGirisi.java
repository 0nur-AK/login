import java.util.Scanner;

public class kullanıcıGirisi {
    public static void main(String[] args) {
        String userName, Password;
        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = inp.nextLine();

        System.out.print("Şifrenizi giriniz : ");
        Password = inp.nextLine();

        if (userName.equals("Onur AK") && Password.equals("123123Pp")) {
            System.out.println("Giriş yaptınız");
        } else if (userName.equals("Onur AK") && !Password.equals("123123Pp")) {

            System.out.print("Şifrenizi yanlış girdiniz!");
            System.out.println("Şifrenizi yenilemek istermisiniz? Evetse 1'i seçiniz. Değilse herhangi bir tuşa basınız");
            int secenek = inp.nextInt();
            inp.nextLine();

            if (secenek==1){
                System.out.println("Yeni şifrenizi giriniz");
                String newpassword = inp.nextLine();
                if (newpassword.equals("123123Pp")) {
                    System.out.println("Yeni belirlediğiniz şifre eski şifrenizle aynı olamaz.");
                } else {
                        System.out.println("Şifreniz başarıyla değiştirilmiştir.");
                    }







            }else{
                System.out.println("Ana sayfaya yönlendiriliyorsunuz.");
            }
        }
    }
}




