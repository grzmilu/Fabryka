
import java.io.*;
import java.util.Random;

public class Kontaktowa implements Strona {
static Random r = new Random();
    BufferedWriter bw;

    private String losujTekst() {
        String s = "";
        for(int i=0;i<r.nextInt(10)+6;i++){
            s=s+(char)(r.nextInt(26)+97);
        }

        return s;
    }

    private String losujNumer(int dl) {
        String s = "";
        for(int i=0;i<dl;i++){
            s=s+r.nextInt(10);
        }

        return s;
    }

    public void tworzStrone(String nazwa) {
        String s="";
        try {
            bw = new BufferedWriter(new FileWriter(nazwa + ".html"));
            bw.write("<hmml><head></head><title>Strona kontaktowa</title><body><h1><center>Strona kontaktowa</center></h1><h3>");
            for(int i=0;i<r.nextInt(5)+5;i++){
                s=s+"Kontakt nr. "+Integer.toString(i+1)+":";
                s=s+"<br>";               
                s=s+"Imie i nazwisko: "+losujTekst()+" "+losujTekst();                
                s=s+"<br>";
                s=s+"Adres: "+losujTekst()+" "+losujNumer(2)+"-"+losujNumer(3);
                s=s+"<br>";
                s=s+"Tel.: "+losujNumer(3)+" "+losujNumer(3)+" "+losujNumer(3);
                s=s+"<br>";
                s=s+"Mail: "+losujTekst()+"@gmail.com";
                s=s+"<br>";
                s=s+"<hr>";
            }
            bw.write(s);
            bw.write("</h3></body></html>");
            bw.close();
        } catch (Exception e) {

        }

    }
}
