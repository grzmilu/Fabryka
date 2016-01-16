
import java.io.*;
import java.util.Random;

public class Informacyjna implements Strona {

    BufferedWriter bw;

    public void tworzStrone(String nazwa) {
        Random r = new Random();
        try {
            bw = new BufferedWriter(new FileWriter(nazwa + ".html"));
            bw.write("<hmml><head><title>Strona informacyjna</title></head><body><h1><center>Strona informacyjna</center></h1><h3><center>");
            String s = "";
            int number;
            char c;
            for (int i = 0; i < 40; i++) {
                for (int j = 0; j < 170; j++) {
                    number = r.nextInt(26) + 97;
                    c = (char) number;
                    s = s + c;
                }
                
                s = s + "<br>";
            }
            bw.write(s);
            bw.write("</center></h3></body></html>");
            bw.close();
        } catch (Exception e) {

        }

    }
}
