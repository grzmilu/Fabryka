
import java.io.*;
import java.util.Random;

public class Aktualnosci implements Strona {

    BufferedWriter bw;

    public void tworzStrone(String nazwa) {
        String s = "";
        Random r = new Random();
        try {
            bw = new BufferedWriter(new FileWriter(nazwa + ".html"));
            bw.write("<hmml><head><title>Aktualnosci</title></head><body><h1><center>Aktualnosci</center></h1>");
            for (int i = 0; i < r.nextInt(3) + 3; i++) {
                s = s + "<h2><center>";
                for (int j = 0; j < r.nextInt(7) + 5; j++) {
                    s = s + (char) (r.nextInt(26) + 65);
                }
                s = s + "</center></h2>";
                s = s + "<h3><center>";
                for (int j = 1; j < r.nextInt(200) + 200; j++) {
                    s = s + (char) (r.nextInt(26) + 97);
                    if (j % 70 == 0) {
                        s = s + "<br>";
                    }
                }
                s = s + "</center></h3>";
                s = s + "<hr>";

            }

            bw.write(s);
            bw.write("</body></html>");
            bw.close();
        } catch (Exception e) {

        }

    }
}
