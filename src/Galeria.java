
import java.io.*;
import java.util.Random;

public class Galeria implements Strona {

    BufferedWriter bw;

    public void tworzStrone(String nazwa) {
        Random r = new Random();
        try {
            bw = new BufferedWriter(new FileWriter(nazwa + ".html"));
            bw.write("<hmml><head><title>Galeria</title></head><body><h1><center>Galeria</center></h1>");
            for (int i = 0; i < r.nextInt(40) + 20; i++) {
                if (r.nextInt(2) == 0) {
                    bw.write(" <img src=\"http://www.freeimageslive.com/galleries/workplace/education/pics/aeiou.jpg\" style=\"width:200px;height:100px;\"> ");
                } else {
                    bw.write(" <img src=\"http://www.freeimageslive.com/galleries/workplace/education/pics/abc.jpg\" style=\"width:200px;height:100px;\"> ");
                }
            }

            bw.write("</body></html>");
            bw.close();
        } catch (Exception e) {

        }

    }
}
