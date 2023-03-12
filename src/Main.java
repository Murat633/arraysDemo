import static java.lang.System.*;
public class Main {
    public static void main(String[] args) {
        String[] ogrenciler = new String[3];
        ogrenciler[0] = "Murat";
        ogrenciler[1] = "Ahmet";
        ogrenciler[2] = "Sellahattin";

        /*
         for(int i = 0;i<ogrenciler.length;i++){
           out.println(ogrenciler[i]);
         out.println(i);
        }
        */

        for(String ogrenci:ogrenciler){
            out.println(ogrenci);
        }
    }
}