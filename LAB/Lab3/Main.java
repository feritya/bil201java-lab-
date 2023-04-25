import java.io.IOException;
// import java.util.ArrayList;

public class Main {
    //Main sınıfını oluşturduk
    public static void main(String[] args) {
        //main metodu oluşturduk
        Field field = new Field();
        try {
            //  try-catch bloğu ile birlikte hata yakalama işlemi yaptık
            field.parseFile("field.txt");
            //parseFile() metodu ile birlikte bir dosya adı alıyoruz
            int bugCount = countBugs(field);
            System.out.println("Total number of bugs: " + bugCount);
            //eğer bugCount 0 dan büyükse ekrana yazdırıyoruz
        } catch (IOException e) {
            //eğer hata oluşursa ekrana yazdırıyoruz
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static int countBugs(Field field) {
        //countBugs() metodu ile birlikte bir Field tipinde bir nesne alıyoruz
        int count = 0;
        for (Bug bug : field.getBugs())
         {
            if (bug != null) {
                count++;
            }
        }
        return count;
        //dönen değeri count değişkenine atıyoruz
    }
}
