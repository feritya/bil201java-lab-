import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Field {
    //Field sınıfını oluşturduk
    private ArrayList<Bug> bugs;

    public Field() {
        //yapıcı metodumuzu oluşturduk
        bugs = new ArrayList<Bug>();
    }

    public void parseFile(String filename) throws IOException {
        //parseFile() metodu ile birlikte bir dosya adı alıyoruz

        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            //dosyayı okuyoruz
            for (int i = 0; i < line.length(); i++) {
                //her satırı okuyoruz
                if (line.charAt(i) == 'O') {
                    //eğer karakter O ise bug sınıfından bir nesne oluşturuyoruz
                    bugs.add(new Bug("|    _\n ###O\n|"));
                } else {
                    //eğer karakter O değilse null değerini ekliyoruz
                    bugs.add(null);
                }
            }
        }
        reader.close();
        //dosyayı kapatıyoruz
    }
    public ArrayList<Bug> getBugs() {
        //getBugs() metodu ile birlikte ArrayList<Bug> tipinde bir dizi döndürüyoruz
        return bugs;
    }
    public String toString() {
        //toString() metodu ile birlikte bir String döndürüyoruz
        String result = "";
        for (int i = 0; i < bugs.size(); i++) {
            // ArrayList<Bug> tipindeki dizi boyutu kadar döngü oluşturuyoruz
            if (bugs.get(i) == null) {
                //eğer dizi elemanı null ise boşluk ekliyoruz
                result += " ";
            } else {
                //eğer dizi elemanı null değilse toString() metodu ile birlikte dönen değeri ekliyoruz
                result += bugs.get(i).toString();
            }
        }
        return result;
        //dönen değeri result değişkenine atıyoruz
    }
}
