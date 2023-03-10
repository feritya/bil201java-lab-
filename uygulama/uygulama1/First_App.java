package uygulama1;

//1.   [1-N] arasındaki tek sayıların ortalamasını bulan kodu yazınız.
//1. Write the code that finds the average of odd numbers between [1-N].
import java.util.Scanner;
class First_App {
    static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = 10;
        int sum = 0;
        int count = 0;


        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                sum += i;
                count++;
            }
        }
        System.out.println("Ortalama: " + (sum / count));

        //Kullanıcının girdiği binary sayıyı,onluk sisteme çeviren kodu yazınız. 1001 =9
        //Write the code that converts the binary number entered by the user to the decimal system. 1001 = 9
        System.out.println("Binary sayı giriniz: ");    
        String binary = input.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal: " + decimal);

       // Kullanıcının girdiği text rakamları integer rakama çeviren kodu yazınız.
         //Write the code that converts the text numbers entered by the user to integer numbers.
          System.out.println("Rakam giriniz: ");
          String number = input.nextLine();
          int number2 = Integer.parseInt(number);
          System.out.println("Integer: " + number2);
    
          //Kullanıcının girdiği text rakamları integer rakama çeviren kodu yazınız.
          //Write the code that converts the text numbers entered by the user to integer numbers.
          System.out.println("Rakam giriniz: ");
          String number3 = input.nextLine();
          int number4 = Integer.parseInt(number3);
          System.out.println("Integer: " + number4);
    
          //Kullanıcının girdiği text rakamları integer rakama çeviren kodu yazınız.
          //Write the code that converts the text numbers entered by the user to integer numbers.
          System.out.println("Rakam giriniz: ");
          String number5 = input.nextLine();
          int number6 = Integer.parseInt(number5);
          System.out.println("Integer: " + number6);
    
          //Kullanıcının girdiği text rakamları integer rakama çeviren kodu yazınız.
          //Write the code that converts the text numbers entered by the user to integer numbers.
          System.out.println("Rakam giriniz: ");
          String number7 = input.nextLine();
          int number8 = Integer.parseInt(number7);
          System.out.println("Integer: " + number8);
    
          //Kullanıcının girdiği text rakamları integer rakama çeviren kodu yazınız.
          //Write the code that converts the text numbers entered by the user to integer numbers.
          System.out.println("Rakam giriniz: ");
          String number9 = input.nextLine();
          int number10 = Integer.parseInt(number9);
          System.out.println("Integer: " + number10);
    
          //Kullanıcının girdiği text rakamları integer rakama çeviren kodu yazınız.
          //Write the code that converts the text numbers entered by the user to integer numbers.
          System.out.println("Rakam giriniz: ");
          String number11 = input.nextLine();
          int number12 = Integer.parseInt(number11);
          System.out.println("Integer: " + number12);
    
          //Kullanıcının girdiği text   rakamları integer rakama çeviren kodu yazınız. örneğin beş = 5
        //Write the code that converts the text numbers entered by the user to integer numbers. for example five = 5

            System.out.println("Rakam giriniz: ");
            String number13 = input.nextLine();
            switch (number13) {
                case "bir":
                    System.out.println("1");    
                    break;
                case "iki": 
                    System.out.println("2");
                    break;
                case "üç":  
                    System.out.println("3");
                    break;
                case "dört":
                    System.out.println("4");
                    break;
                case "beş":
                    System.out.println("5");
                    break;

                case "altı":
                    System.out.println("6");
                    break;  
                case "yedi":
                    System.out.println("7");
                    break;
                case "sekiz":
                    System.out.println("8");
                    break;
                case "dokuz":
                    System.out.println("9");
                    break;
                case "on":
                    System.out.println("10");
                    break;

                default:
                    System.out.println("Hatalı giriş");
                    break;
            }
     
               



        
        
    }
}