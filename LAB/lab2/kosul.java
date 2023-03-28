import java.util.Scanner;

public class kosul {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        System.out.println("bir sayi giriniz: ");
        int first_number = girdi.nextInt();
       
        if(first_number%2 == 0){
            System.out.println("sayi cifttir");

        }
        else{
            System.out.println("sayi tektir");
        }
        if(first_number>=0){
            
            if(first_number == 0){
                System.out.println("sayi sifirdir");
            }
            else{
                System.out.println("sayi pozitiftir");
            }
        }
        else{
            System.out.println("sayi negatiftir");
        }
    }
    
}
