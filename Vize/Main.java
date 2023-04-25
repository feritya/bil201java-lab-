import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;


class Uye { //üye sınıfı ana sınıf
    String ad, soyad, mail;
    //ana sınıfın yapıcı metodu
    public Uye(String ad, String soyad, String mail) {
        this.ad = ad;
        this.soyad = soyad;
        this.mail = mail;
    }
//ana sınıfın getter metotları
    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getMail() {
        return mail;
    }
}
//elit üye sınıfı
class ElitUye extends Uye {
    public ElitUye(String ad, String soyad, String mail) {
        super(ad, soyad, mail);
    }
}
//genel üye sınıfı
class GenelUye extends Uye {
    public GenelUye(String ad, String soyad, String mail) {
        super(ad, soyad, mail);
    }
}
//main sınıfı 
public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1: Elit üye ekleme");
            System.out.println("2: Genel üye ekleme");
            System.out.println("3: Mail gönderme");

            int secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    elitUyeEkle();
                    break;
                case 2:
                    genelUyeEkle();
                    break;
                case 3:
                    mailGonderme();
                    break;
                default:
                    System.out.println("Geçersiz seçim");
            }
        }
    }
//elit üye ekleme metodu
    public static void elitUyeEkle() {
        System.out.print("Ad: ");
        String ad = scanner.next();

        System.out.print("Soyad: ");
        String soyad = scanner.next();

        System.out.print("Mail: ");
        String mail = scanner.next();

        ElitUye elitUye = new ElitUye(ad, soyad, mail);
        //elit üyelerin mail adresleri elitUyeler.txt dosyasında saklanıyor
        try {
            FileWriter writer = new FileWriter("elitUyeler.txt", true);
            writer.write(elitUye.getAd() + "\t" + elitUye.getSoyad() + "\t" + elitUye.getMail() + "\n");//elit üyelerin mail adresleri elitUyeler.txt dosyasında saklanıyor
            writer.close();

            System.out.println("Elit üye başarıyla eklendi");
        } catch (IOException e) {
            System.out.println("Dosya açılırken bir hata oluştu");//dosya açılırken hata oluşursa
        }
    }

    public static void genelUyeEkle() {//   genel üye ekleme metodu
        System.out.print("Ad: ");
        String ad = scanner.next();

        System.out.print("Soyad: ");
        String soyad = scanner.next();

        System.out.print("Mail: ");
        String mail = scanner.next();

        GenelUye genelUye = new GenelUye(ad, soyad, mail);//    genel üyelerin mail adresleri genelUyeler.txt dosyasında saklanıyor

        try {
            FileWriter writer = new FileWriter("genelUyeler.txt", true);//                      genel üyelerin mail adresleri genelUyeler.txt dosyasında saklanıyor
            writer.write(genelUye.getAd() + "\t" + genelUye.getSoyad() + "\t" + genelUye.getMail() + "\n");//                      genel üyelerin mail adresleri genelUyeler.txt dosyasında saklanıyor
            writer.close();

            System.out.println("Genel üye başarıyla eklendi");
        } catch (IOException e) {
            System.out.println("Dosya açılırken bir hata oluştu");
        }
    }

    public static void mailGonderme() {//mail gönderme metodu
        while (true) {
            System.out.println("1: Elit üyelere mail");
            System.out.println("2: Genel üyelere mail");
            System.out.println("3: Tüm üyelere mail");
            System.out.println("4: Geri dön");

            int secim = scanner.nextInt();//seçim yapılıyor

            switch (secim) {
                case 1:
                    elitUyelereMailGonder();
                    break;
                case 2:
                    genelUyelereMailGonder();
                    break;
                case 3:
                    tumUyelereMailGonder();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Geçersiz seçim");
            }
        }
    }

    public static void elitUyelereMailGonder() {
        // Elit üyelerin mail adresleri elitUyeler.txt dosyasında saklanıyor
        try (BufferedReader reader = new BufferedReader(new FileReader("elitUyeler.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("mail.txt"))) {

       String satir = reader.readLine();//satır okunuyor
       while (satir != null) {//satır boş değilse
           String[] uye = satir.split("\t");//satır boşluklara göre ayrılıyor
           String ad, soyad;
            ad = uye[0];
            soyad = uye[1];
            System.out.print("elit üyelere gönderilecek maili giriniz: ");
            String mail = scanner.next();

           System.out.println( ad + " " + soyad + "  a Mail gönderiliyor: " + mail);// Mail gönderme işlemleri burada gerçekleştirilir

           // Mail gönderme işlemleri burada gerçekleştirilir

           writer.write(uye[2] + "\n");//mail.txt dosyasına mail adresleri yazılıyor

           satir = reader.readLine();//satır okunuyor
       }

   } catch (IOException e) {
       System.out.println("Dosya okunurken veya yazılırken bir hata oluştu");//dosya okunurken veya yazılırken hata oluşursa
   }
}
    

    public static void genelUyelereMailGonder() {//
        // Genel üyelerin mail adresleri genelUyeler.txt dosyasında saklanıyor
        try (BufferedReader reader = new BufferedReader(new FileReader("genelUyeler.txt"));//dosya okunuyor reader ile
        BufferedWriter writer = new BufferedWriter(new FileWriter("mail.txt"))) {//dosya yazılıyor writer ile

       String satir = reader.readLine();//satır okunuyor
       while (satir != null) {  //satır boş değilse
           String[] uye = satir.split("\t");//satır boşluklara göre ayrılıyor
           String ad, soyad;//ad soyad ve mail değişkenleri oluşturuluyor
            ad = uye[0];
            soyad = uye[1];
            System.out.print("genel üyelere gönderilecek maili giriniz: ");
            String mail = scanner.next();

           System.out.println( ad+ " " + soyad +"a Mail gönderiliyor: "  + mail);

           // Mail gönderme işlemleri burada gerçekleştirilir

           writer.write(uye[2] + "\n");

           satir = reader.readLine();
       }

   } catch (IOException e) {
       System.out.println("Dosya okunurken veya yazılırken bir hata oluştu");
   }
    }

    public static void tumUyelereMailGonder() {
        elitUyelereMailGonder();
        genelUyelereMailGonder();
    }
}
