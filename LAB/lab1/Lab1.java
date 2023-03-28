import java.util.Scanner;


    public class Lab1{
        public static void main(String[] args) {
            String degisken = String.join(" ", args);
            String degiskenBuyukHarf = degisken.toUpperCase();
String degiskenDuzelt = degisken.replace("*", " "); 

System.out.println(degisken + ", " + degiskenBuyukHarf + "  " + degiskenDuzelt);
    }
}