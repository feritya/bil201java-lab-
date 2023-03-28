import java.time.LocalDate;

public class time {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        int mounth = today.getMonthValue();

       switch(mounth){
        case 1:
            System.out.println("mevsim kış \naylardan ocak ayı");
            break;
        case 2:
        System.out.println("mevsim kış\naylardan subat ayı");
            break;
        case 3:
        System.out.println("mevsim ilkbahar\n aylardan mart ayı");
            break;
        case 4:
        System.out.println("mevsim ilkbahar aylardan nisan ayı");
            break;
        case 5:
        System.out.println("mevsim ilkbahar \naylardan mayıs ayı");
            break;
        case 6:
        System.out.println("mevsim yaz\n aylardan haziran ayı");
            break;
        case 7:
        System.out.println("mevsim yaz \naylardan temmuz ayı");
            break;
        case 8:

        System.out.println("mevsim yaz\n aylardan agustos ayı");
            break;
        case 9:
        System.out.println("mevsim sonbahar \naylardan eylül ayı");
            break; 
        case 10:
        System.out.println("mevsim sonbahar \naylardan ekim ayı");
            break;
        case 11:
        System.out.println("mevsim sonbahar \naylardan kasım ayı");
            break;  
        case 12:
        System.out.println("mevsim kış \naylardan aralık ayı");
            break;
       }
    }
    
}
