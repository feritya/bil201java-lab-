import java.util.Scanner;


    public class Lab1{
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String degisken = scanner.nextLine();
        scanner.close();
String degiskenBuyukHarf = degisken.toUpperCase();
String degiskenDuzelt = degisken.replace("*", " "); 

System.out.println(degisken + ", " + degiskenBuyukHarf + " ve " + degiskenDuzelt);
}
}
